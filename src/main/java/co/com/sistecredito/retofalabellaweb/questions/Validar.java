package co.com.sistecredito.retofalabellaweb.questions;

import net.serenitybdd.screenplay.Question;

import static co.com.sistecredito.retofalabellaweb.userinterface.Pago.*;

public class Validar {

    private Validar() {
    }

    public static Question<Boolean> montoAPagar() {
        return actor -> {
           String monto = MONTOAPAGAR.resolveFor(actor).getText();
           String montof = monto.replace("$","").replace(".","");
           int montopago = Integer.parseInt(montof);
           return montopago > 0;
        };
    }


}
