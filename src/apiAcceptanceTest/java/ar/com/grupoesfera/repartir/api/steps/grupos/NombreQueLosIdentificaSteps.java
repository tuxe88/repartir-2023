package ar.com.grupoesfera.repartir.api.steps.grupos;

import ar.com.grupoesfera.repartir.api.steps.CucumberSteps;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static org.assertj.core.api.Assertions.assertThat;

public class NombreQueLosIdentificaSteps extends CucumberSteps {

    private String nombreIndicado;
    private String mensaje;

    @Cuando("el usuario crea un grupo indicando el nombre {string}")
    public void elUsuarioCreaUnGrupoIndicandoElNombre(String nombre) {

        nombreIndicado = nombre;

        throw new PendingException();
    }

    @Entonces("debería visualizar dentro del listado el grupo con el nombre indicado")
    public void deberiaVisualizarDentroDelListadoElGrupoConElNombreIndicado() {

        throw new PendingException();
    }

    @Cuando("el usuario intenta crear un grupo sin indicar su nombre")
    public void elUsuarioIntentaCrearUnGrupoSinIndicarSuNombre() {

        throw new PendingException();
    }

    @Entonces("no debería crear el grupo sin nombre")
    public void noDeberiaCrearElGrupoSinNombre() {

        throw new PendingException();
    }

    @Y("debería ser informado que no puede crear un grupo sin nombre")
    public void deberiaSerInformadoQueNoPuedeCrearUnGrupoSinNombre() {

        throw new PendingException();
    }

}
