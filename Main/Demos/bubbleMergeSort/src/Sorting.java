public class Sorting {

    public void ascendingBubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int index = 0; index < array.length - i - 1; index++) {
                if (array[index] > array[index + 1]) {
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
    }

    public void descendingBubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int index = 0; index < array.length - i - 1; index++) {
                if (array[index] < array[index + 1]) {
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
    }

    public void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int[] leftHalf = new int[array.length / 2];
        int[] rightHalf = new int[array.length - leftHalf.length];

        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = array[leftHalf.length+i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(leftHalf, rightHalf, array);
    }

    private void merge(int[] leftHalf, int[] rightHalf, int[] array) {
        int leftIndex = 0;
        int rightIndex = 0;
        int arrayIndex = 0;

        while ((leftIndex < leftHalf.length) && (rightIndex < rightHalf.length)) {
            if (leftHalf[leftIndex] < rightHalf[rightIndex]) {
                array[arrayIndex] = leftHalf[leftIndex];
                leftIndex++;
                arrayIndex++;
            }
            else {
                array[arrayIndex] = rightHalf[rightIndex];
                rightIndex++;
                arrayIndex++;
            }
        }

        while (leftIndex < leftHalf.length) {
            array[arrayIndex] = leftHalf[leftIndex];
            arrayIndex++;
            leftIndex++;
        }

        while (rightIndex < rightHalf.length) {
            array[arrayIndex] = rightHalf[rightIndex];
            arrayIndex++;
            rightIndex++;
        }
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public void insertionSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public void quickSort(int[] array, int start, int end) {
        int pivot = partition(array, start, end);
        if (start < pivot -1) {
            quickSort(array, start, pivot-1);
        }
        if (pivot < end) {
            quickSort(array, pivot, end);
        }
    }

    private int partition(int[] array, int start, int end) {
        int i = start;
        int j = end;
        int temp;
        int pivot = array[(start + end) /2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
}
