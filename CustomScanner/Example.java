package CustomScanner;

public class Example {
    public static void main(String[] args) {
        String stringInput = Scanner.getString("Enter the string");
        System.out.println("String entered: " + stringInput);

        try {

            int intInput = Scanner.getInt("Enter a int");
            System.out.println("int entered: " + intInput);

            double doubleInput = Scanner.getDouble("Enter a double");
            System.out.println("Double entered: " + doubleInput);

            float floatInput = Scanner.getFloat("Enter a float");
            System.out.println("Float entered: " + floatInput);

            long longInput = Scanner.getLong("Enter a long");
            System.out.println("String entered: " + longInput);

            char charInput = Scanner.getChar("Enter a character");
            System.out.println("Character entered: " + charInput);

        } catch (Exception e) {
            e.printStackTrace();
            ;
        }
    }
}
