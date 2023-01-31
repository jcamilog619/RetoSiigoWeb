package co.com.certification.taks;

import co.com.certification.userinterface.NavegadorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegadorDe implements Task {

    private NavegadorPage navegadorPage;

    public static AbrirNavegadorDe laPagina(){
        return Tasks.instrumented(AbrirNavegadorDe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(navegadorPage));
    }
}
