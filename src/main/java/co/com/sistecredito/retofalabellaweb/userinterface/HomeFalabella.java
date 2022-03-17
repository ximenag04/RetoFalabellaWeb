package co.com.sistecredito.retofalabellaweb.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeFalabella {

    public static final Target BUSQUEDA = Target.the("buscar el producto").located(By.id("testId-SearchBar-Input"));
    public static final Target BTNBUSQUEDA = Target.the("presionar el boton de buscar").located(By.className("SearchBar-module_searchBtnIcon__6KVum"));

    private HomeFalabella() {
    }
}
