package DataTypeSP;

public class IntegerTypes {
    public static void main(String args[]) {
        System.out.println("Byte, Min: " + Byte.MIN_VALUE + ", Max: " + Byte.MAX_VALUE + ", BYTES: " + Byte.BYTES);
        System.out.println("Short, Min: " + Short.MIN_VALUE + ", Max: " + Short.MAX_VALUE + ", BYTES: " + Short.BYTES);
        System.out.println("Integer, Min: " + Integer.MIN_VALUE + ", Max: " + Integer.MAX_VALUE + ", BYTES: " + Integer.BYTES);
        System.out.println("Long, Min: " + Long.MIN_VALUE + ", Max: " + Long.MAX_VALUE + ", BYTES: " + Long.BYTES);

//        long l = 2147483648;    // Error:(10, 18) java: integer number too large: 2147483648
        long l = 2147483648L;
        System.out.println("l: " + l);

        long l2 = Integer.MAX_VALUE + 1;    // Numeric overflow
        System.out.println("l2: " + l2);    // l2: -2147483648

        long l3 = (long)Integer.MAX_VALUE + 1;
        System.out.println("l3: " + l3);

        long l4 = Integer.MAX_VALUE + 1L;
        System.out.println("l4: " + l4);

        int i = 0xffff;
        System.out.println("i: " + i);

        int i2 = 077;   // may be easily confused with decimal literals.
        System.out.println("i2: " + i2);

        int i3 = 0b1111_1111;
        System.out.println("i3: " + i3);

        int i4 = 1_234_567_890;
        System.out.println("i4: " + i4);
    }
}
