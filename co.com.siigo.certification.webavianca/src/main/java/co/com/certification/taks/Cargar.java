package co.com.certification.taks;

import co.com.certification.interactions.CargarDatoFeature;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;
import java.util.Map;

import static co.com.certification.utils.ConstantesExcepcion.EXCEPTION_CARGAR_DATOS;


public class Cargar {
    private Cargar() {
        throw new IllegalStateException(EXCEPTION_CARGAR_DATOS);
    }

    public static CargarDatoFeature datosCon(List<Map<String, Object>> informacion) {
        return Tasks.instrumented(CargarDatoFeature.class, informacion);
    }
}

