public class ArregloSAN extends AlmacenamientoServidor {
    private int cantidadDiscos;
    public ArregloSAN(double capacidad, double tasa, String proveedor, int discos) {
        super(capacidad, tasa, proveedor); cantidadDiscos = discos;
    }
    @Override
    public double calcularCostoMensual() { return cantidadDiscos * 5000; }
}