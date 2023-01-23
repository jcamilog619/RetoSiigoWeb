package co.com.certification.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AviancaDatosPagina extends PageObject {


    public static final Target COOKIES_ANDCREAM = Target.the("Activar cookies")

            .located(By.xpath("//*[@id='cookiePolicy']/div/div/div[2]/button"));

    public static final Target TXT_DESDE = Target.the("Seleccionar desde")
            .located(By.xpath("//div[contains(@id,'ida_regreso')]//input[contains(@id,'pbOrigen_')]"));

    public static final Target TXT_HACIA = Target.the("Seleccionar hasta")
            .located(By.xpath("//div[contains(@id,'ida_regreso')]//input[contains(@id,'pbDestino')]"));

    public static final Target FECHA_INICIAL = Target.the("Seleccionar Fecha ida")
            .located(By.xpath("//div[contains(@id,'ida_regreso')]//input[contains(@id,'pbFechas_1')]"));

    public static final Target FECHA_FINAL = Target.the("Seleccionar Fecha regreso")
            .located(By.xpath("//div[contains(@id,'ida_regreso')]//input[contains(@id,'pbFechas_1')]"));










}
