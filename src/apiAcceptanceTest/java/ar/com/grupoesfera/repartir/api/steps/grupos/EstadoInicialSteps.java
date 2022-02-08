package ar.com.grupoesfera.repartir.api.steps.grupos;

import ar.com.grupoesfera.repartir.api.steps.CucumberSteps;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class EstadoInicialSteps extends CucumberSteps {

    @Cuando("el usuario crea un grupo")
    public void elUsuarioCreaUnGrupo() {

        throw new PendingException();
    }

    @Entonces("debería visualiza dentro del listado el grupo creado con total {string}")
    public void deberiaVisualizaDentroDelListadoElGrupoCreadoConTotal$(String monto) {

        throw new PendingException();
    }
}
