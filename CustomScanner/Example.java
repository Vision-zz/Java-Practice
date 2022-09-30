package CustomScanner;

public class Example {
    public static void main(String[] args) {
        String stringInput = CustomScanner.getString("Enter the string");
        System.out.println("String entered: " + stringInput);

        try {

            int intInput = CustomScanner.getInt("Enter a int");
            System.out.println("int entered: " + intInput);

            double doubleInput = CustomScanner.getDouble("Enter a double");
            System.out.println("Double entered: " + doubleInput);

            float floatInput = CustomScanner.getFloat("Enter a float");
            System.out.println("Float entered: " + floatInput);

            long longInput = CustomScanner.getLong("Enter a long");
            System.out.println("String entered: " + longInput);

            char charInput = CustomScanner.getChar("Enter a character");
            System.out.println("Character entered: " + charInput);

        } catch (Exception e) {
            e.printStackTrace();
            ;
        }
    }
}
