package site.ftka;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClienteDeCorreo {

    @Test
    void test1() {
        Archivo archivo = new Archivo("");
        assertEquals(0, archivo.getTamano());

        archivo = new Archivo("-".repeat(10));
        assertEquals(10, archivo.getTamano());

        //

        Email email = new Email("", "", null);
        assertEquals(0, email.getTamano());

        email = new Email("-".repeat(10), "-".repeat(10), List.of(archivo));
        assertEquals(30, email.getTamano());

        //

        Carpeta carpeta = new Carpeta("");
        carpeta.agregarEmail(email);
        assertEquals(30, carpeta.getTamano());

        carpeta = new Carpeta("-".repeat(10));
        carpeta.agregarEmail(email);
        assertEquals(40, carpeta.getTamano());

        //

        ClienteDeCorreo cliente = new ClienteDeCorreo();
        cliente.agregarCarpeta(carpeta);
        assertEquals(40 + cliente.getInbox().getTamano(), cliente.espacioOcupado());
    }

}