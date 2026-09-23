package gestion;

import edu.unilibre.datos.Bicicleta;
import edu.unilibre.datos.Parqueadero;
import edu.unilibre.datos.TipoPago;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GestorParqueadero {
    private Parqueadero parqueadero;

    public GestorParqueadero() {
        this.parqueadero = new Parqueadero();
    }

    public boolean adicionarBici(int serial, String color, int documPropietario){
        if (parqueadero.obtenerBicisActivas()>=parqueadero.obtenerCupos()){
            return false;
        }
        Bicicleta bicicleta = new Bicicleta(serial, color, documPropietario);
        parqueadero.obtenerListaBicis().add(bicicleta);
        parqueadero.modificarBicisActivas(parqueadero.obtenerBicisActivas()+1);
        parqueadero.modificarContBici(parqueadero.obtenerContBici()+1);
        return true;
    }

    public boolean registrarSalidaBici(int documPropietario, TipoPago pago){
        Bicicleta biciGuardada=null;
        for (Bicicleta bici:parqueadero.obtenerListaBicis()){
            if (bici.obtenerDocPropietario()==documPropietario){
                biciGuardada=bici;
                break;
            }
        }
        if (biciGuardada==null){
            return false;
        }
        LocalDateTime horaSalida = LocalDateTime.now();
        long min = Duration.between(biciGuardada.obtenerHoraEntrada(),horaSalida).toMinutes();
        if (min==0) min=1;
        double costoTotal=min* parqueadero.obtenerTarifa();
        double Ingresos=parqueadero.obtenerTotalIngressos()+costoTotal;
        parqueadero.modificarTotalIngressos(Ingresos);
        parqueadero.obtenerListaBicis().remove(biciGuardada);
        parqueadero.modificarBicisActivas(parqueadero.obtenerBicisActivas()-1);
        return true;
    }

    public String generarReporte(){
        return "Bicicletas ingresadas el dia de hoy "+ parqueadero.obtenerContBici()+"\n Total ingresos: "+parqueadero.obtenerTotalIngressos();
    }

}
