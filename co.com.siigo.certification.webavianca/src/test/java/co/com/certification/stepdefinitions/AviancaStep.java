package co.com.certification.stepdefinitions;

import co.com.certification.models.TestData;
import co.com.certification.taks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;


public class AviancaStep {

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el (.*) ingreso al navegador$")
    public void queElUsuarioIngresoAlNavegador(String cliente) {
        OnStage.theActorCalled(cliente).wasAbleTo(
                AbrirNavegadorDe.laPagina());
    }

    @Y("^selecciono la pagina de avianca$")
    public void seleccionoLaPaginaDeAvianca(List<Map<String, Object>> infoCliente) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                DatosAvianca.pagina(),
                Cargar.datosCon(infoCliente));
    }

    @Cuando("^realiza la busqueda de la reserva en el portal de avianca$")
    public void realizaLaBusquedaDeLaReservaEnElPortalDeAvianca() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Reservar.aviancaPage(TestData.info()));
    }

    @Cuando("^realiza la reserva del vuelo$")
    public void realizaLaReservaDelVuelo() {

    }

    @Entonces("^se visualizara el resumen de la reserva$")
    public void seVisualizaraElResumenDeLaReserva() {

    }
}
