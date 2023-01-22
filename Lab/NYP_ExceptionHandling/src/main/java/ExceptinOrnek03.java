public class ExceptinOrnek03 {
        public static void main(String[] args) {
        try {
            int[] numbers = new int[]{1, 34, 56, 23, 78, 123, 49};
            int[] dividers = new int[]{5, 0, 12, 0, 34,2,3};
            multipleDivision(numbers, dividers);
        } 
        catch (RuntimeException ex) {
            System.out.println("Fatal error, program terminated"+ex.toString());
        }
    }
  
    private static void multipleDivision(int[] numbers, int[] dividers) throws IllegalArgumentException  {
        if (numbers.length != dividers.length) {
            System.out.println("Array sizes are not equal");
            throw new IllegalArgumentException("Array sizes must be equal");
        }
        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(numbers[i] + "/" + dividers[i] + "=" + numbers[i] / dividers[i]);
            } catch (ArithmeticException ex) {
                System.out.println("Division by 0, " + numbers[i] + "/" + dividers[i]);
            }
        }
        System.out.println("Program ended successfully");
    }
}