public class HW2 {

    private static void invertArrayVar1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
    }

    private static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        private static void fillDiagonal1 ( int[][] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0, z = arr.length - 1; j < arr.length; j++, z--) {
                    if (i == j || i == z) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        private static int findMax ( int[] arr){
            int max = arr[0];

            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        }

        private static int findMin ( int[] arr){
            int min = arr[0];

            for (int i : arr) {
                if (i < min) {
                    min = i;
                }
            }
            return min;
        }
    }
}