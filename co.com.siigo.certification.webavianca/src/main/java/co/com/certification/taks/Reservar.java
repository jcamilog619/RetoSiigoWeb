package co.com.certification.taks;

import co.com.certification.userinterface.AviancaDatosPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.Map;


public class Reservar implements Task {

    private AviancaDatosPagina aviancaDatosPagina;
    private final Map<String, Object> testData;

    public Reservar(Map<String, Object> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(AviancaDatosPagina.COOKIES_ANDCREAM));

        actor.attemptsTo(Click.on(AviancaDatosPagina.TXT_DESDE));
        actor.attemptsTo(
                Enter.theValue(testData.get("ciudadIda").toString()).into(AviancaDatosPagina.TXT_DESDE)
                          .thenHit(Keys.ARROW_DOWN),
                Hit.the(Keys.ENTER).into(AviancaDatosPagina.TXT_DESDE));


        actor.attemptsTo(
                Click.on(AviancaDatosPagina.TXT_HACIA));
        actor.attemptsTo(
                Enter.theValue(testData.get("ciudadRegreso").toString()).into(AviancaDatosPagina.TXT_HACIA)
                        .thenHit(Keys.ARROW_DOWN),
                Hit.the(Keys.ENTER).into(aviancaDatosPagina.TXT_HACIA),
                Click.on(AviancaDatosPagina.FECHA_INICIAL),
                Click.on(AviancaDatosPagina.FECHA_FINAL));
    }
    public static Reservar aviancaPage(Map<String, Object> testData) {
        return new Reservar(testData);
    }
}
