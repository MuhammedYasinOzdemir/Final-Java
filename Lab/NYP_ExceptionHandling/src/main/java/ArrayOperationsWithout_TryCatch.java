public class ArrayOperationsWithout_TryCatch {
    public static void main(String[] args) {
        ArrayOperations operations = new ArrayOperations();
        int[] numbers = new int[7];
        System.out.println("before calling put value");
        operations.putValue(numbers, 10, 27);
        System.out.println("after calling put value");
    }
}
