package ar.com.grupoesfera.repartir.services;

import ar.com.grupoesfera.repartir.exceptions.GrupoInvalidoException;
import ar.com.grupoesfera.repartir.exceptions.GrupoNoEncontradoException;
import ar.com.grupoesfera.repartir.exceptions.GruposNombresDuplicadosException;
import ar.com.grupoesfera.repartir.model.Gasto;
import ar.com.grupoesfera.repartir.model.Grupo;
import ar.com.grupoesfera.repartir.repositories.GruposRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GruposService {

    @Autowired
    GruposRepository repository;

    @Autowired
    MontosService montos;

    public List<Grupo> listarGrupos() {

        return  repository.findAll();
    }

    public Grupo crear(Grupo grupo) {

        if (!grupo.estaFormado()) {
            throw new GrupoInvalidoException();
        }

        if (Strings.isBlank(grupo.getNombre())) {
            throw new GrupoInvalidoException();
        }

        if (grupo.tieneDuplicados()) {
            throw new GruposNombresDuplicadosException();
        }

        montos.inicializarTotal(grupo);
        repository.save(grupo);

        return grupo;
    }

    public Grupo recuperar(Long id) {

        Optional<Grupo> grupoBuscado = repository.findById(id);

        if (!grupoBuscado.isPresent()) {
            throw new GrupoNoEncontradoException();
        }

        return grupoBuscado.get();
    }

    public Grupo agregarGasto(Long id, Gasto gasto) {

        Grupo grupo = recuperar(id);
        montos.acumularAlTotal(grupo, gasto);
        repository.save(grupo);
        return grupo;
    }

}
