package ed.u2.sorting;

import static ed.u2.sorting.Main.printArray;

public final class BurbbleSort {

    // Metodo que implementa el algoritmo burble sort
    public void burbbleSort(int[] array) {
        // Variables para contar el número de iteraciones y swaps realizados
        int iteraciones = 0; // Cuenta cuántas comparaciones se realizan
        int swaps = 0;       // Cuenta cuántos intercambios se realizan

        // Bucle externo: controla las pasadas a través del arreglo
        // Cada pasada asegura que el elemento más grande de la sublista no ordenada
        // se "burbujee" hacia su posición final
        for (int i = 0; i < array.length - 1; i++) {
            // Imprime el número de pasada actual
            System.out.println("\n[Pasada " + (i + 1) + "]");

            // Bucle interno: compara elementos adyacentes dentro de la sublista no ordenada
            for (int j = 0; j < array.length - 1 - i; j++) {
                // Incrementa el contador de iteraciones por cada comparación
                iteraciones++;

                // Si el elemento actual es mayor que el siguiente, se realiza un intercambio
                if (array[j] > array[j + 1]) {
                    // Intercambio de los elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Incrementa el contador de swaps
                    swaps++;
                }
            }

            // Imprime el estado actual del arreglo después de cada pasada
            System.out.print("Iteracion actual: ");
            printArray(array);
        }

        // Imprime el total de iteraciones y swaps realizados al final del algoritmo
        System.out.println("\n");
        System.out.println("Total de iteraciones en Bubble Sort = " + iteraciones);
        System.out.println("Total de swaps en Bubble Sort = " + swaps);
    }
}
