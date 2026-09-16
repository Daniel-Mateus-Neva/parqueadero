package edu.unilibre.datos;

import java.time.LocalDateTime;

public class Parqueadero {
    private int cupos;
    private double tarifa;
    private double totalIngresos;
    private int contBici;
    private int bicisActivas;
    private Bicicleta listaBicis;
    private LocalDateTime horaSalida;

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
    public Bicicleta obtenerListaBicis() {
        return listaBicis;
    }
    public void obtenerListaBicis(Bicicleta listaBicis) {
        this.listaBicis = listaBicis;
    }
    public LocalDateTime obtenerHoraSalida() {
        return horaSalida;
    }
    public void modificarHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }
}
