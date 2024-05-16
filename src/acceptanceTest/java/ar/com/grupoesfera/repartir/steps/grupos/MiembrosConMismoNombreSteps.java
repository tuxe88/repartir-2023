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
        var grupoTR = driver.findElements(By.cssSelector("app-grupos table tr"));
        assertThat(grupoTR).hasSizeGreaterThan(1);

        var campoTDs = grupoTR.get(1).findElements(By.tagName("td"));
        assertThat(campoTDs.get(0).getText()).isNotEmpty();
    }
    @Entonces("deberia ser informado que todos los usuarios del grupo deben tener nombres diferente")
    public void DeberiaSerInformadoQueTodosLosUsuariosDelGrupoDebenTenerNombresDiferentes() {
        var wait = new WebDriverWait(driver, 2);
        var mensajesToast = wait.withMessage("Mostro Toast")
                .until(visibilityOfElementLocated(By.id("mensajesToast")));
        wait.withMessage("Título del Toast es 'Error'")
                .until(textToBePresentInElement(mensajesToast, "Error"));
        assertThat(mensajesToast.getText())
                .as("Descripción del Toast")
                .contains("No se puede guardar. los nombres de los miembros no deben ser iguales.");
    }


}
