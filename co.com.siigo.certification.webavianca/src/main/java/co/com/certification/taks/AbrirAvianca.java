package co.com.certification.taks;

import co.com.certification.userinterface.NavegadorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirAvianca implements Task {

    private NavegadorPage navegadorPage;

    public static AbrirAvianca laPagina(){
        return Tasks.instrumented(AbrirAvianca.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(navegadorPage));
    }
}
