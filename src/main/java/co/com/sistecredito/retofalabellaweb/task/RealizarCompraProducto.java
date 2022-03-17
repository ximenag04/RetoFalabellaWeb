package co.com.sistecredito.retofalabellaweb.task;

import co.com.sistecredito.retofalabellaweb.model.DatosCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;


import java.util.List;

import static co.com.sistecredito.retofalabellaweb.userinterface.BolsaCompras.*;
import static co.com.sistecredito.retofalabellaweb.userinterface.DespachoCompras.*;
import static co.com.sistecredito.retofalabellaweb.userinterface.HomeFalabella.*;

public class RealizarCompraProducto implements Task {

    private List<DatosCompra> datosCompras;
    private String busqueda;
    private int cantidad;
    private String departamento;
    private String ciudad;
    private String barrio;
    private String direccion;
    private String complemento;
    private String numtarjeta;
    private String numdocumento;

    public RealizarCompraProducto(List<DatosCompra> datosCompras) {
        this.datosCompras = datosCompras;
        this.busqueda = datosCompras.get(0).getBusqueda();
        this.cantidad = datosCompras.get(0).getCantidad();
        this.departamento = datosCompras.get(0).getDepartamento();
        this.ciudad = datosCompras.get(0).getCiudad();
        this.barrio = datosCompras.get(0).getBarrio();
        this.direccion = datosCompras.get(0).getDireccion();
        this.complemento = datosCompras.get(0).getComplemento();
        this.numtarjeta = datosCompras.get(0).getNumtarjeta();
        this.numdocumento = datosCompras.get(0).getNumdocumento();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(busqueda).into(BUSQUEDA),
                Click.on(BTNBUSQUEDA),
                Click.on(SELECCIONARPRODUCTO)
        );

        for (int i = 0; i < cantidad; i++) {
            actor.attemptsTo(
                    Click.on(AUMENTOCANTIDADPRODUCTO)
            );
        }

        actor.attemptsTo(
                Click.on(VERBOLSACOMPRAS),
                Click.on(COMPRAR),
                Scroll.to(SELECCIONARDEPARTAMENTO.of(departamento)),
                Click.on(SELECCIONARDEPARTAMENTO.of(departamento)),
                Click.on(SELECCIONARCIUDAD.of(ciudad)),
                Click.on(SELECCIONARBARRIO.of(barrio)),
                Click.on(SELECCIONARCONTINUAR),
                Scroll.to(DIRECCION),
                Enter.theValue(direccion).into(DIRECCION),
                Enter.theValue(complemento).into(COMPLEMENTODIRECCION)
        );

    }

    public static RealizarCompraProducto realizarCompraProducto(List<DatosCompra> datosCompras) {
        return Tasks.instrumented(RealizarCompraProducto.class, datosCompras);
    }
}
