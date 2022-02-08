package ar.com.grupoesfera.repartir.api.steps.inicio;

import ar.com.grupoesfera.repartir.api.steps.CucumberSteps;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Dado;

public class BienvenidaSteps extends CucumberSteps {

    @Then("el usuario accede a la aplicación")
    public void elUsuarioAccedeALaAplicacion() {

        throw new PendingException();
    }

    @Then("se muestra el mensaje de bienvenida")
    public void seMuestraElMensajeDeBienvenida() {

        throw new PendingException();
    }

    @Given("que el usuario accedió a la aplicación")
    public void queElUsuarioAccedioALaAplicacion() {

        throw new PendingException();
    }

    @When("decidió iniciar")
    public void decidioIniciar() {

        throw new PendingException();
    }

    @Then("puede empezar a usarla")
    public void puedeEmpezarAUsarla() {

        throw new PendingException();
    }

    @Dado("que el usuario inició Repartir")
    public void elUsuarioInicioRepartir() {

        baseDeDatos.estaVacia();

        throw new PendingException();
    }

    @Before
    public void prepararBaseDeDatos() {

        baseDeDatos.estaVacia();
    }

}
