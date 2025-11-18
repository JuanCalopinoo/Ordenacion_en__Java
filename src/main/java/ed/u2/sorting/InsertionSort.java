package ed.u2.sorting;

import static ed.u2.sorting.Main.printArray;

public final class InsertionSort {

    // Constructor vacío
    public InsertionSort() {
    }

    // Metodo que implementa el algortimo Insertion Sort
    public void insertionSort(int[] array) {
        // Variable para contar el número de iteraciones realizadas
        int iteraciones = 0;

        // Bucle externo: recorre el arreglo desde el segundo elemento hasta el final
        for (int i = 1; i < array.length; i++) {
            // La clave es el elemento actual que se va a insertar en la posición correcta
            int key = array[i];
            // Índice del elemento anterior
            int j = i - 1;

            // Imprime el número de iteración y el valor que se está insertando
            System.out.println("\n[Iteración " + i + "] Insertando: " + key);

            // Bucle interno: mueve los elementos mayores que la clave una posición hacia adelante
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; // Desplaza el elemento hacia adelante
                j--; // Decrementa el índice para comparar con el elemento anterior
                iteraciones++; // Incrementa el contador de iteraciones
            }

            // Inserta la clave en su posición correcta
            array[j + 1] = key;

            // Imprime el estado actual del arreglo después de cada iteración
            System.out.print("Estado actual: ");
            printArray(array);
        }

        // Imprime el total de iteraciones realizadas al final del algoritmo
        System.out.println("\n");
        System.out.println("Total de iteraciones en Insertion Sort = " + iteraciones);
    }
}
