package ar.com.grupoesfera.repartir.api.steps.grupos;

import ar.com.grupoesfera.repartir.api.steps.CucumberSteps;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CompuestosPorAlMenosDosMiembrosSteps extends CucumberSteps {

    private List<String> miembros;

    private String mensaje;

    @Cuando("el usuario crea un grupo indicando que sus miembros son {miembros}")
    public void elUsuarioCreaUnGrupoIndicandoQueSusMiembrosSon(List<String> miembros) {

        this.miembros = miembros;

        throw new PendingException();
    }

    @Entonces("visualiza dentro del listado el grupo con los miembros indicados")
    public void visualizaDentroDelListadoElGrupoConLosMiembrosIndicados() {

        throw new PendingException();
    }

    @Cuando("el usuario intenta crear un grupo indicando un único miembro")
    public void elUsuarioIntentaCrearUnGrupoIndicandoUnUnicoMiembro() {

        throw new PendingException();
    }

    @Entonces("no debería crear el grupo con un único miembro")
    public void noDeberiaCrearElGrupoConUnUnicoMiembro() {

        throw new PendingException();
    }

    @Y("debería ser informado que necesita tener al menos dos miembros")
    public void deberiaSerInformadoQueNecesitaTenerAlMenosDosMiembros() {

        throw new PendingException();
    }
}
