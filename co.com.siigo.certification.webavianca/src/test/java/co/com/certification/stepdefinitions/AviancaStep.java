package co.com.certification.stepdefinitions;

import co.com.certification.models.TestData;
import co.com.certification.taks.AbrirAvianca;
import co.com.certification.taks.Cargar;
import co.com.certification.taks.Reservar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
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
    public void queElUsuarioIngresoAlNavegador(String cliente,List<Map<String, Object>> infoCliente) {
        OnStage.theActorCalled(cliente).wasAbleTo(
                Cargar.datosCon(infoCliente),
                AbrirAvianca.laPagina());
    }


    @Cuando("^realizo la busqueda de la reserva en el portal de avianca$")
    public void realizoLaBusquedaDeLaReservaEnElPortalDeAvianca() {
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
