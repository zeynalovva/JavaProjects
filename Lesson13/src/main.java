public class main {
    public static void main(String[] args) {

        // StackOverFlowError
        try {
            rec();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError: " + e.getMessage());
        }

        // ArithmeticException
        try {
            int result = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        // IndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        }

        // OutOfMemoryError
        try {
            int[] largeArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError: " + e.getMessage());
        }

        // Custom Exception
        try {
            throw new CustomException("a custom exception");
        } catch (CustomException e) {
            System.out.println("CustomException: " + e.getMessage());
        }
    }

    public static void rec() {
        rec();
    }
}