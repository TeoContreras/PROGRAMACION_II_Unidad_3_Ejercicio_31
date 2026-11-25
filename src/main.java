public class main {
    public static void main(String[] args) {
        AlmacenamientoServidor[] unidades = new AlmacenamientoServidor[3];
        unidades[0] = new UnidadNAS(4000, 200, "Synology", 4);
        unidades[1] = new ArregloSAN(12000, 800, "Dell", 8);
        unidades[2] = new AlmacenamientoNube(1000, 500, "Cloud", 25);
        for (int i = 0; i < unidades.length; i++) {
            unidades[i].mostrarDatos();
            System.out.println("Costo mensual: $" + unidades[i].calcularCostoMensual());
        }
    }
}