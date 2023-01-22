public class ArrayOperations {
    public void putValue(int[] array, int index, int value) {
        System.out.println("    putValue method started");
        array[index] = value;
        System.out.println("    putValue method ended successfully");
    }
    public static void main(String[] args) {
        ArrayOperations operations = new ArrayOperations();
        int[] numbers = new int[7];
        try {
            System.out.println("try block is started");
            operations.putValue(numbers, 12, 27);
            System.out.println("try block is ended");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception catched " + ex.toString());
        }
        System.out.println("Program ends gracefully");
    }
}