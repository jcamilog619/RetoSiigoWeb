package co.com.certification.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.certification.userinterface.NavegadorPagina.BTN_AVIANCA;
import static co.com.certification.userinterface.NavegadorPagina.TXT_AVIANCA;
import static co.com.certification.utils.ConstastesTransversales.PAGINA_AVIANCA;

public class DatosAvianca implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(PAGINA_AVIANCA).into(TXT_AVIANCA).thenHit(Keys.ENTER));

        actor.attemptsTo(
                Click.on(BTN_AVIANCA));
    }

    public static DatosAvianca pagina() {
        return new DatosAvianca();
    }
}
