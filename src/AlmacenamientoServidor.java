public class AlmacenamientoServidor {
    protected double capacidadGb, tasaTransferenciaMb;
    protected String proveedor;
    public AlmacenamientoServidor(double capacidad, double tasa, String proveedor) {
        capacidadGb = capacidad; tasaTransferenciaMb = tasa; this.proveedor = proveedor;
    }
    public double calcularCostoMensual() { return 0; }
    public void mostrarDatos() {
        System.out.println("Proveedor: " + proveedor + " - Capacidad: " + capacidadGb + " GB - Transferencia: " + tasaTransferenciaMb + " MB/s");
    }
}