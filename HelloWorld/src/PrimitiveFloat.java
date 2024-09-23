public class PrimitiveFloat {
    public static void main(String[] args) {
        float realFloat = 1.5e-10F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float type corresponds in bytes to " + Float.BYTES);
        System.out.println("float type corresponds in bits to " + Float.SIZE);
        System.out.println("maximum value of a float: " + Float.MAX_VALUE);
        System.out.println("minimum value of a float: " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double type corresponds in bytes to " + Double.BYTES);
        System.out.println("double type corresponds in bits to " + Double.SIZE);
        System.out.println("maximum value of a double: " + Double.MAX_VALUE);
        System.out.println("minimum value of a double: " + Double.MIN_VALUE);
    }
}
