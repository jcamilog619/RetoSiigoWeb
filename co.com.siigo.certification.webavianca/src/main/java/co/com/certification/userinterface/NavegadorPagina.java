package co.com.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class NavegadorPagina extends PageObject {

    public static final Target IFRAME = Target.the("Buscar iframe")
            .located(By.xpath("//iframe[contains(@id,'backgroundImage')]"));

    public static final Target TXT_AVIANCA = Target.the("Txt ingresar a la pagina Avianca")
            .located(By.xpath("//*[contains(@class,'gLFyf')]"));

    public static final Target BTN_AVIANCA = Target.the("Click para ingresar a la pagina Avianca")
            .located(By.xpath("//*[contains(@data-pcu,'https://www.avianca.com/')]"));
}
