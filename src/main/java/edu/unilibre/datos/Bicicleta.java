package edu.unilibre.datos;

import java.time.LocalDate;

public class Bicicleta {
    private int serial;
    private String color;
    private int documPropietario;
    private LocalDate horaEntrada;

    public int obtenerSerial() {
        return serial;
    }

    public void modificarSerial(int serial) {
        this.serial = serial;
    }

    public String obtenerColor() {
        return color;
    }

    public void modificarColor(String color) {
        this.color = color;
    }

    public int obtenerDocPropietario() {
        return documPropietario;
    }
    public void modificarDocPropietario(int docPropietario) {
        this.documPropietario = docPropietario;
    }
    public LocalDate obtenerHoraEntrada() {
        return horaEntrada;
    }
    public void modificarHoraEntrada(LocalDate horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
}
