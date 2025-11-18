package ed.u2.sorting;

import static ed.u2.sorting.Main.printArray;

public final class SelectionSort {

    // Constructor vacío
    public SelectionSort() {
    }

    // Implementa el algoritmo Selection Sort
    public void selectionSort(int[] array) {
        // Variables para contar el número de iteraciones y swaps realizados
        int iteraciones = 0; // Cuenta cuántas comparaciones se realizan
        int swaps = 0;       // Cuenta cuántos intercambios se realizan

        // Bucle externo: recorre el arreglo y selecciona el elemento mínimo en cada iteración
        for (int i = 0; i < array.length - 1; i++) {
            // Índice del elemento mínimo encontrado en la sublista no ordenada
            int minIndex = i;

            // Imprime el número de iteración y la posición desde donde se busca el mínimo
            System.out.println("\n[Iteración " + (i + 1) + "] Buscando mínimo desde posición " + i);

            // Bucle interno: busca el índice del elemento mínimo en la sublista no ordenada
            for (int j = i + 1; j < array.length; j++) {
                iteraciones++; // Incrementa el contador de iteraciones por cada comparación
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Actualiza el índice del mínimo si se encuentra uno menor
                }
            }

            // Realiza un intercambio si el mínimo encontrado no está en la posición actual
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
                swaps++; // Incrementa el contador de swaps
            }

            // Imprime el estado actual del arreglo después de cada iteración
            System.out.print("Estado actual: ");
            printArray(array);
        }

        // Imprime el total de iteraciones y swaps realizados al final del algoritmo
        System.out.println("\n");
        System.out.println("Total de iteraciones en Selection Sort = " + iteraciones);
        System.out.println("Total de swaps en Selection Sort = " + swaps);
    }
}
