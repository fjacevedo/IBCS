public class PrimitiveIntegers {
    public static void main(String[] args) {

        byte byteNumber = 127;
        System.out.println("byteNumber = " + byteNumber);
        System.out.println("byte type corresponds in bytes to " + Byte.BYTES);
        System.out.println("byte type corresponds in bits to " + Byte.SIZE);
        System.out.println("maximum value of a byte: " + Byte.MAX_VALUE);
        System.out.println("minimum value of a byte: " + Byte.MIN_VALUE);

        short shortNumber = 32767;
        System.out.println("shortNumber = " + shortNumber);
        System.out.println("short type corresponds in bytes to " + Short.BYTES);
        System.out.println("short type corresponds in bits to " + Short.SIZE);
        System.out.println("maximum value of a short: " + Short.MAX_VALUE);
        System.out.println("minimum value of a short: " + Short.MIN_VALUE);

        int intNumber = 2147483647;
        System.out.println("intNumber = " + intNumber);
        System.out.println("int type corresponds in bytes to " + Integer.BYTES);
        System.out.println("int type corresponds in bits to " + Integer.SIZE);
        System.out.println("maximum value of an int: " + Integer.MAX_VALUE);
        System.out.println("minimum value of an int: " + Integer.MIN_VALUE);

        long longNumber = 9223372036854775807L;
        System.out.println("longNumber = " + longNumber);
        System.out.println("long type corresponds in bytes to " + Long.BYTES);
        System.out.println("long type corresponds in bits to " + Long.SIZE);
        System.out.println("maximum value of a long: " + Long.MAX_VALUE);
        System.out.println("minimum value of a long: " + Long.MIN_VALUE);

        var varNumber = 9223372036854775808F;
    }
}
