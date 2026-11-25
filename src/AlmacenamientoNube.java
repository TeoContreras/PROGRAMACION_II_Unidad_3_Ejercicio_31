public class AlmacenamientoNube extends AlmacenamientoServidor {
    private double costoPorGb;
    public AlmacenamientoNube(double capacidad, double tasa, String proveedor, double costo) {
        super(capacidad, tasa, proveedor); costoPorGb = costo;
    }
    @Override
    public double calcularCostoMensual() { return capacidadGb * costoPorGb; }
}