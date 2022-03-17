package co.com.sistecredito.retofalabellaweb.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Pago {

    public static final Target MONTOAPAGAR = Target.the("ingresar el complemento de la direccion").located(By.xpath("//span[@class='fbra_text fbra_test_orderSummary__totalCostPrice fbra_orderSummary__totalCostPrice']"));

    private Pago() {
    }
}
