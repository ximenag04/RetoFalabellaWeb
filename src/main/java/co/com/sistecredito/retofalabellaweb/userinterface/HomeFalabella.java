package co.com.sistecredito.retofalabellaweb.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeFalabella {

    public static final Target CATEGORIAS = Target.the("buscar la categoria de los productos").located(By.xpath("//div[@class='HamburgerBtn-module_icon__1ctEI']"));
    public static final Target CELULARES = Target.the("presionar el boton de Celulares").located(By.xpath("//ul[@class=\"TaxonomyDesktop-module_firstLevelMenu__desktop__2F44_\"]/li/div/p[text()='Celulares']"));
    public static final Target TELEFONIA = Target.the("seleccionar el tipo de telefonia").located(By.xpath("//ul[@id=\"testId-ThirdLevelMenu-link-container\"]/li/a[text()='Xiaomi']"));

    private HomeFalabella() {
    }
}
