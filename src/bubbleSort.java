

public class bubbleSort { 
public static void main(String[] params) {
        int[] array = new int[] {5,9,3,1,2};
        bubbleSort(array);
        System.out.println(arrayToString(array));
    }
public static void bubbleSort(int[] a) {
    int lastSwap = a.length - 1;
    for (int i = 1; i < a.length; i++) {
        boolean is_sorted = true;
        int currentSwap = -1;
        for (int j = 0; j < lastSwap; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
                is_sorted = false;
                currentSwap = j;
            }
        }
        if (is_sorted) return;
        lastSwap = currentSwap;
        System.out.println(arrayToString(a));
    }
}
//    public static void bubbleSort(int[] array) {
//        boolean isSorted = false;
//        while (!isSorted) {
//            isSorted = true;
//            for (int i = 1; i < array.length; i++) {
//                if (array[i - 1] > array[i]) {
//                    int tmp = array[i];
//                    array[i] = array[i - 1];
//                    array[i - 1] = tmp;
//                    isSorted = false;
//                }
//            }
//        }
//    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}

