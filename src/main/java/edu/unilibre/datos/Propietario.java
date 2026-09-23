package edu.unilibre.datos;

public class Propietario {
    private int documento;
    private String nombre;
    private TipoPago efectivo;
    private TipoPago tarjeta;

    public Propietario(int documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    public int obtenerDocumento() {
        return documento;
    }
    public void modificarDocumento(int documento) {
        this.documento = documento;
    }
    public String obtenerNombre() {
        return nombre;
    }
    public void modificarNombre(String nombre) {
        this.nombre = nombre;
    }
    public TipoPago obtenerEfectivo() {
        return efectivo;
    }
    public void modificarEfectivo(TipoPago efectivo) {
        this.efectivo = efectivo;
    }
    public TipoPago obtenerTarjeta() {
        return tarjeta;
    }
    public void modificarTarjeta(TipoPago tarjeta) {
        this.tarjeta = tarjeta;
    }
}
