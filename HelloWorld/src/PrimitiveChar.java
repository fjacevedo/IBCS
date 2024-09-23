public class PrimitiveChar {
    public static void main(String[] args) {
        char character = '\u0040';
        char decimal = 64;
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal equals character: " + (decimal == character));

        char symbol = '@';
        System.out.println("symbol = " + symbol);
        System.out.println("symbol equals character: " + (symbol == character));

        // Special characters
        char space = '\u0020';
        char backspace = '\b';
        char tab = '\t';
        char newLine = '\n';
        char carriageReturn = '\r';

        System.out.println("Character type corresponds in bytes to " + Character.BYTES);
        System.out.println("Character type corresponds in bits to " + Character.SIZE);
        System.out.println("maximum value of a character: " + Character.MAX_VALUE);
        System.out.println("minimum value of a character: " + Character.MIN_VALUE);
    }
}
