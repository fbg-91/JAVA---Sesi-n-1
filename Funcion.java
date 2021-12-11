public class Funcion {

    public static void main(String[] args) {

        double precio = getPrecio(24.99d);
        System.out.println(precio);

    }

    public static double getPrecio(double precio) {
        return precio * 0.79;
    }
}
