package co.com.sistecredito.retofalabellaweb.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Pago {

    public static final Target NUMTARJETA = Target.the("ingresar el numero de la tarjeta").located(By.id("txt-tarjeta-cmr"));
    public static final Target NUMDOCUMENTO = Target.the("ingresar el numero del documento").located(By.id("txt-numero-tarjeta"));
    public static final Target MONTOAPAGAR = Target.the("verificar el monto a pagar").located(By.xpath("//span[@class='fbra_text fbra_test_orderSummary__totalCostPrice fbra_orderSummary__totalCostPrice']"));

    private Pago() {
    }
}
