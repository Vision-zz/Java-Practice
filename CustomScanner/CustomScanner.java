public class CustomScanner {
    private CustomScanner() {
    }

    public static String getString() {
        return getString(null);
    }

    public static String getString(String prompt, Object... args) {
        return System.console().readLine(prompt + "\n", args);
    }

    public static int getInt() throws Exception {
        return getInt(null);
    }

    public static int getInt(String prompt, Object... args) throws Exception {
        String input = System.console().readLine(prompt + "\n", args);
        return Integer.parseInt(input);
    }

    public static double getDouble() throws Exception {
        return getDouble(null);
    }

    public static double getDouble(String prompt, Object... args) throws Exception {
        String input = System.console().readLine(prompt + "\n", args);
        return Double.parseDouble(input);
    }

    public static float getFloat() throws Exception {
        return getFloat(null);
    }

    public static float getFloat(String prompt, Object... args) throws Exception {
        String input = System.console().readLine(prompt + "\n", args);
        return Float.parseFloat(input);
    }

    public static long getLong() throws Exception {
        return getLong(null);
    }

    public static long getLong(String prompt, Object... args) throws Exception {
        String input = System.console().readLine(prompt, args);
        return Long.parseLong(input);
    }

    public static char getChar() throws Exception {
        return getChar(null);
    }

    public static char getChar(String prompt, Object... args) throws Exception {
        String input = System.console().readLine(prompt, args);
        if (input.length() > 1)
            throw new Exception("Character length is out of bounds");
        return input.toCharArray()[0];
    }

}
