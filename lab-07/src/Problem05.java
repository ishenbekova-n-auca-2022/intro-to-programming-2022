public class Problem05 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array3 = {1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        int[] array4 = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5};
        int[] array5 = {5, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1};

        selectionSort(array1);
        selectionSort(array2);
        selectionSort(array3);
        selectionSort(array4);
        selectionSort(array5);

        printArray(array1);
        printArray(array2);
        printArray(array3);
        printArray(array4);
        printArray(array5);
    }

    public static void printArray(int[] a) {
        if (a.length > 0) {
            System.out.print(a[0]);
        }
        for (int i = 1; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }
}
