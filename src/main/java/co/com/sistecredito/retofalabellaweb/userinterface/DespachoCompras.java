package co.com.sistecredito.retofalabellaweb.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DespachoCompras {

    public static final Target SELECCIONARDEPARTAMENTO = Target.the("seleccionar el departamento").locatedBy("//select[@id='region']/option[text()='{0}']");
    public static final Target SELECCIONARCIUDAD = Target.the("seleccionar la ciudad").locatedBy("//select[@id='ciudad']/option[text()='{0}']");
    public static final Target SELECCIONARBARRIO = Target.the("seleccionar el barrio").locatedBy("//select[@id='comuna']/option[text()='{0}']");
    public static final Target SELECCIONARCONTINUAR = Target.the("seleccionar el boton continuar").located(By.xpath("//div[@class=\"fbra_appContainer__buttonField fbra_test_appContainer__buttonField\"]/div/button"));
    public static final Target DIRECCION = Target.the("ingresar la direccion").located(By.xpath("//input[@id='address']"));
    public static final Target COMPLEMENTODIRECCION = Target.the("ingresar el complemento de la direccion").located(By.xpath("//input[@id='departmentNumber']"));
    public static final Target INGRESARDIRECCION = Target.the("seleccionar el boton ingresar direccion").located(By.xpath("//button[@name='useAddress']"));
    public static final Target CONTINUARAPAGO = Target.the("seleccionar el boton continuar para ir a pago").located(By.xpath("//button[@class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']"));

    private DespachoCompras() {
    }
}