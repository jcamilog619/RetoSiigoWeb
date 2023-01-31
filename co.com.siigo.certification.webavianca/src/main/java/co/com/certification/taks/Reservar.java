package co.com.certification.taks;

import co.com.certification.userinterface.AviancaDatosPagina;
import co.com.certification.utils.Fecha;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.Map;

import static co.com.certification.userinterface.AviancaDatosPagina.*;
import static co.com.certification.utils.ConstastesTransversales.CIUDAD_IDA;
import static co.com.certification.utils.ConstastesTransversales.CIUDAD_REGRESO;


public class Reservar implements Task {
    private final Map<String, Object> testData;

    public Reservar(Map<String, Object> testData) {
        this.testData = testData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(AviancaDatosPagina.COOKIES));

        actor.attemptsTo(
                Click.on(AviancaDatosPagina.TXT_DESDE),
                Enter.theValue(testData.get(CIUDAD_IDA).toString()).into(AviancaDatosPagina.TXT_DESDE)
                        .thenHit(Keys.ARROW_DOWN),
                Hit.the(Keys.ENTER).into(AviancaDatosPagina.TXT_DESDE));

        actor.attemptsTo(
                Click.on(AviancaDatosPagina.TXT_HACIA),
                Enter.theValue(testData.get(CIUDAD_REGRESO).toString()).into(AviancaDatosPagina.TXT_HACIA)
                        .thenHit(Keys.ARROW_DOWN),
                Hit.the(Keys.ENTER).into(TXT_HACIA),
                Click.on(AviancaDatosPagina.FECHA_INICIAL));

        actor.attemptsTo(
                Click.on(FECHA_DE_SALIDA.of(Fecha.getMes(), Fecha.getFecha())),
                Click.on(AviancaDatosPagina.FECHA_FINAL),
                Click.on(FECHA_DE_REGRESO.of(Fecha.getMesRegreso(), Fecha.getFechaRegreso())));

        actor.attemptsTo(
                Click.on(BTN_PASAJEROS),
                Click.on(SELC_PASAJEROS),
                Click.on(SELC_NINOS),
                Click.on(BTN_CONTINUAR),
                Click.on(BTN_BUSCAR_VUELOS)
        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static Reservar aviancaPage(Map<String, Object> testData) {
        return new Reservar(testData);
    }
}
