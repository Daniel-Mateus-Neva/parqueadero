package edu.unilibre.datos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Bicicleta {
    private int serial;
    private String color;
    private int documPropietario;
    private LocalDateTime horaEntrada;

    public Bicicleta(int serial, String color, int documPropietario) {
        this.serial = serial;
        this.color = color;
        this.documPropietario = documPropietario;
        this.horaEntrada = LocalDateTime.now();
    }

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
    public LocalDateTime obtenerHoraEntrada() {
        return horaEntrada;
    }
}
