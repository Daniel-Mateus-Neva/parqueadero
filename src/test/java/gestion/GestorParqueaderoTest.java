package gestion;

import edu.unilibre.datos.Bicicleta;
import edu.unilibre.datos.Parqueadero;
import edu.unilibre.datos.TipoPago;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GestorParqueaderoTest {
    private GestorParqueadero gestor;

    @BeforeEach
    public void setUp() {
        gestor = new GestorParqueadero();
    }

    @Test
    public void adicionarBicicletaOk() {
        boolean resultado = gestor.adicionarBici(12345, "Rojo", 10203040);
        assertTrue(resultado);
    }

    @Test
    public void adicionarBicicletaCuposLlenos() {
        boolean resultado = true;
        for (int i = 0; i < 21; i++) {
            resultado = gestor.adicionarBici(100 + i, "Negro", 5000 + i);
        }
        assertFalse(resultado, "No debería permitir agregar más bicicletas si se supera el límite de cupos.");
    }

    @Test
    public void registrarSalidaBicicletaOk() {
        gestor.adicionarBici(98765, "Azul", 88888);
        boolean salidaOk = gestor.registrarSalidaBici(88888, TipoPago.EFECTIVO);
        assertTrue(salidaOk);
    }

    @Test
    public void registrarSalidaBicicletaInexistente() {
        boolean salidaFalsa = gestor.registrarSalidaBici(99999, TipoPago.TARJETA);
        assertFalse(salidaFalsa);
    }
}
