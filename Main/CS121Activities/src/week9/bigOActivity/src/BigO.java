public class BigO {


        public static void printOnce(String string) {
            System.out.println(string);
            System.out.println();
        }

        public static void printNTimes(int n) {
            for (int i = 1; i <= n; i++) {
                System.out.println("#" + i + " of " + n);
            }
            System.out.println();
        }

        public static void printNSquaredTimes(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.println("Outside loop value: " + i + ". Nested loop value: " + j  + ".");
                }
            }
            System.out.println();
        }
    }

