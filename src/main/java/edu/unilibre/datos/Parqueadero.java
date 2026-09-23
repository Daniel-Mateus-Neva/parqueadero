package edu.unilibre.datos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private int cupos;
    private double tarifa;
    private double totalIngresos;
    private int contBici;
    private int bicisActivas;
    private List<Bicicleta> listaBicis=new ArrayList<Bicicleta>();
    private LocalDateTime horaSalida;

    public Parqueadero(){
        cupos=20;
        tarifa=10;
        totalIngresos=0;
        contBici=0;
        bicisActivas=0;
    }

    public int obtenerCupos() {
        return cupos;
    }
    public void modificarCupos(int cupos) {
        this.cupos = cupos;
    }
    public double obtenerTarifa() {
        return tarifa;
    }
    public void modificarTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public double obtenerTotalIngressos() {
        return totalIngresos;
    }
    public void modificarTotalIngressos(double totalIngressos) {
        this.totalIngresos = totalIngressos;
    }
    public int obtenerContBici() {
        return contBici;
    }
    public void modificarContBici(int contBici) {
        this.contBici = contBici;
    }
    public int obtenerBicisActivas() {
        return bicisActivas;
    }
    public void modificarBicisActivas(int bicisActivas) {
        this.bicisActivas = bicisActivas;
    }
    public List<Bicicleta> obtenerListaBicis() {
        return listaBicis;
    }
    public LocalDateTime obtenerHoraSalida() {
        return horaSalida;
    }
    public void modificarHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }
}
