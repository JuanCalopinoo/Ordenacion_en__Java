package ed.u2.sorting;

public class Main {
    /* ARREGLOS DEL TALLER */
    // Diferentes casos de prueba para evaluar los algoritmos de ordenación
    static int[] A = {8, 3, 6, 3, 9}; // Caso normal
    static int[] B = {5, 4, 3, 2, 1}; // Caso inverso
    static int[] C = {1, 2, 3, 4, 5}; // Caso ya ordenado
    static int[] D = {2, 2, 2, 2, 2}; // Caso con elementos duplicados
    static int[] E = {9, 1, 8, 2};    // Caso mixto

    /* CASOS BORDE */
    static int[] F = {};              // Caso vacío
    static int[] G = {1};             // Caso con un solo elemento
    static int[] H = {1, 2, 3, 4, 5, 6}; // Caso ya ordenado (más grande)
    static int[] I = {6, 5, 4, 3, 2, 1}; // Caso inverso (más grande)
    static int[] J = {5, 4, 4, 3, 3, 2, 1}; // Caso con duplicados

    public static void main(String[] args) {
        // Instancias de las clases de algoritmos de ordenación
        BurbbleSort burbble = new BurbbleSort();
        SelectionSort selection = new SelectionSort();
        InsertionSort insertion = new InsertionSort();

        // Mensaje de bienvenida
        System.out.println("-------- BIENVENIDO A LA PRACTICA DE ALGORITMOS DE ORDENACION -----------");

        // Ejecución del algoritmo Bubble Sort
        System.out.println("===== BURBBLE SORT =====");
        burbble.burbbleSort(B.clone()); // Se usa un clon del arreglo para evitar modificar el original

        // Ejecución del algoritmo Selection Sort
        System.out.println("\n===== SELECTION SORT =====");
        selection.selectionSort(B.clone());

        // Ejecución del algoritmo Insertion Sort
        System.out.println("\n===== INSERTION SORT =====");
        insertion.insertionSort(B.clone());
    }

    // Metodo auxiliar para imprimir el contenido de un arreglo
    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
