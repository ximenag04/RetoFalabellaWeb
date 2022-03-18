package co.com.sistecredito.retofalabellaweb.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BolsaCompras {

    public static final Target SELECCIONARPRODUCTO = Target.the("seleccionar el producto encontrado").located(By.xpath("(//div[@id=\"testId-searchResults-products\"]/div//button/div/div[text()='Agregar a la Bolsa'])[1]"));
    public static final Target AUMENTOCANTIDADPRODUCTO = Target.the("aumentar cantidad de producto seleccionado").located(By.id("testId-stepper-increment-btn"));
    public static final Target VERBOLSACOMPRAS = Target.the("seleccionar boton de ver bolsa").located(By.xpath("//a[@id=\"linkButton\"]"));
    public static final Target COMPRAR = Target.the("seleccionar boton ir a comprar").located(By.xpath("//div[@class='fb-order-status__cta']/button"));

    private BolsaCompras() {
    }

}
