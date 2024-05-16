package ar.com.grupoesfera.repartir.steps.grupos;

import ar.com.grupoesfera.repartir.steps.CucumberSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class MiembrosConMismoNombreSteps extends CucumberSteps {

    @Entonces("no deberia crear el grupo con dos miembros con el mismo nombre")
    public void NoDeberiaCrearElGrupoConDosMiembrosConElMismoNombre() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("deberia ser informado que todos los usuarios del grupo deben tener nombres diferente")
    public void DeberiaSerInformadoQueTodosLosUsuariosDelGrupoDebenTenerNombresDiferentes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
