public class UnidadNAS extends AlmacenamientoServidor {
    private int cantidadBahias;
    public UnidadNAS(double capacidad, double tasa, String proveedor, int bahias) {
        super(capacidad, tasa, proveedor); cantidadBahias = bahias;
    }
    @Override
    public double calcularCostoMensual() { return cantidadBahias * 1500; }
}