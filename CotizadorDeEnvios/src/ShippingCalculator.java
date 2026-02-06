public class ShippingCalculator {
    private final double IVA = 0.16;
    private final double RECARGO_REMOTO = 0.10;
    public double calcularSubtotal(double pesoKg, double distanciaKm, double tipoServicio, boolean zonaRemota) {
        int costoInicial;
        if (tipoServicio ==2) {
            costoInicial =90;
        }
        else {
            costoInicial =50;
        }
        double costoPeso = pesoKg*12.0;
        double costoDistancia;

        if (distanciaKm <=50) {
            costoDistancia = 20.0;
        }
        else if (distanciaKm <=200) {
            costoDistancia=60.0;
        }
        else {
            costoDistancia=20.0;
        }

        double subtotal = costoInicial + costoPeso + costoDistancia;

        if (zonaRemota) {
            subtotal += (subtotal * RECARGO_REMOTO);
        }

        return subtotal;
    }

    public double calcularIVA(double subtotal) {
        return subtotal * IVA;
    }

    public double calcularTotal(double subtotal, double iva) {
        return subtotal + iva;
    }
}