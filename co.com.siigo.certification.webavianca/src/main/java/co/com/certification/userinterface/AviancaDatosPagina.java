package co.com.certification.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AviancaDatosPagina extends PageObject {


    public static final Target COOKIES = Target.the("Activar cookies")
            .located(By.xpath("//*[@id='cookiePolicy']/div/div/div[2]/button"));

    public static final Target TXT_DESDE = Target.the("Seleccionar desde")
            .located(By.xpath("//div[contains(@id,'ida_regreso')]//input[contains(@id,'pbOrigen_')]"));

    public static final Target TXT_HACIA = Target.the("Seleccionar hasta")
            .located(By.xpath("//div[contains(@id,'ida_regreso')]//input[contains(@id,'pbDestino')]"));

    public static final Target FECHA_INICIAL = Target.the("Seleccionar Fecha ida")
            .located(By.xpath("//div[contains(@id,'ida_regreso')]//input[contains(@id,'pbFechas_1')]"));

    public static final Target FECHA_DE_SALIDA = Target.the("la fecha de salida")
            .locatedBy("//div[@data-close-select='true']//div[@data-month='2023.{0}']//div[@data-day='2023.{1}']");

    public static final Target FECHA_FINAL = Target.the("Seleccionar Fecha regreso")
            .located(By.xpath("//div[contains(@id,'ida_regreso')]//input[contains(@id,'pbFechas_1')]"));
    public static final Target FECHA_DE_REGRESO = Target.the("la fecha de regreso")
            .locatedBy("//div[@data-close-select='true']//div[@data-month='2023.{0}']//div[@data-day='2023.{1}']");

    public static final Target BTN_PASAJEROS = Target.the("Seleccionar pasajeros")
            .located(By.xpath("//div[contains(@id,'ida_regreso')]//input[contains(@id,'pbPasajeros_1')]"));

    public static final Target SELC_PASAJEROS = Target.the("Seleccionar pasajeros adultos")
            .located(By.xpath("//div[@data-hidecabinas='false']//div[contains(@data-name,'pbPasajeros_1')]//div[@data-property='adults' and@class='plus control']"));

    public static final Target SELC_NINOS = Target.the("Seleccionar pasajeros niños")
            .located(By.xpath("//div[@data-hidecabinas='false']//div[contains(@data-name,'pbPasajeros_1')]//div[@data-property='child' and@class='plus control']"));

    public static final Target BTN_CONTINUAR = Target.the("Btn para continuar la reserva")
            .located(By.xpath("//div[@data-hidecabinas='false']//div[contains(@data-name,'pbPasajeros_1')]//button[contains(@class,'btn-secondary')]"));

    public static final Target BTN_BUSCAR_VUELOS = Target.the("Seleccionar pasajeros")
            .located(By.xpath("//div[contains(@class,'boton-container')]//button[@title='Buscar vuelos']"));

}
