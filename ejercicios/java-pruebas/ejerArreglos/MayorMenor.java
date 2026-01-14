public class MayorMenor {
    public static void main(String[] args) {
//calcular en un array numero mayor y menor de un array
        int[] arreglo = {5, 8, 2, 9, 1, 7};

        int mayor = arreglo[0];
        int menor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {

            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }

            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
