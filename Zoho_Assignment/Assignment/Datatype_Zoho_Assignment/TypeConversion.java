public class TypeConversion {
    public static void main(String[] args) {
        // Rules for Type conversion
        // Numeric to Numeric both explicit and implicit conversion allowed
        // but Narrawing and Widening Concept needed
        // Widening
        // byte-short-int-long-float-double both implicit and explit allowed
        // Narrawing
        // double-float-long-int-short-byte only explit allowed
        // But Numeric to Non-Numeric conversion only Explicit conversion allowed not
        // implicit conversion
        // byte 8 bit
        TypeConversion type = new TypeConversion();
        type.byteConversion();
        type.shortConversion();
        type.intConversion();
        type.longConversion();
        type.floatConversion();
        type.doubleConversion();
        type.charConversion();
    }

    byte byteConversion() {
        // System.out.println("Byte " + Math.pow(2, 7));
        byte byteA = Byte.MIN_VALUE;
        byte byteB = Byte.MAX_VALUE;
        System.out.println("byte Conversions : \n");
        // short 16 bit
        // System.out.println("Short " + Math.pow(2, 15));
        System.out.println("Byte to short");
        short shortA = byteA;
        short shortB = (short) (byteA + byteB);
        System.out.println(shortA);
        System.out.println(shortB);
        // int 32 bit
        // System.out.println("int " + Math.pow(2, 31));
        System.out.println("Byte to int");
        int intA = byteA;
        int intB = (int) (byteA + byteB);
        System.out.println(intA);
        System.out.println(intB);
        // long 64 bit
        // System.out.println("long " + Math.pow(2, 63));
        long longA = byteA;
        long longB = (long) (byteA + byteB);
        System.out.println("Byte to long");
        System.out.println(longA);
        System.out.println(longB);
        // float 32 bit
        float floatA = byteA;
        float floatB = (float) (byteA + byteB);
        System.out.println("Byte to float");
        System.out.println(floatA);
        System.out.println(floatB);
        // double 32 bit
        double doubleA = byteA;
        double doubleB = (double) (byteA + byteB);
        System.out.println("Byte to double");
        System.out.println(doubleA);
        System.out.println(doubleB);
        // char 16 bit
        char charA = (char) byteA;
        System.out.println("Byte to char");
        System.out.println(charA);
        return 0;
    }

    short shortConversion() {
        short shortA = Short.MIN_VALUE;
        short shortB = Short.MAX_VALUE;
        System.out.println("Short Conversions : \n");
        // byte 8 bit
        System.out.println("short to byte");
        byte byteA = (byte) shortA;
        byte byteB = (byte) (shortA + shortB);
        System.out.println(byteA);
        System.out.println(byteB);
        // int 32 bit
        System.out.println("short to int");
        int intA = shortA;
        int intB = (int) (shortA + shortB);
        System.out.println(intA);
        System.out.println(intB);
        // long 64 bit
        long longA = shortA;
        long longB = (long) (shortA + shortB);
        System.out.println("short to long");
        System.out.println(longA);
        System.out.println(longB);
        // float 32 bit
        float floatA = shortA;
        float floatB = (float) (shortA + shortB);
        System.out.println("short to float");
        System.out.println(floatA);
        System.out.println(floatB);
        // double 32 bit
        double doubleA = shortA;
        double doubleB = (double) (shortA + shortB);
        System.out.println("short to double");
        System.out.println(doubleA);
        System.out.println(doubleB);
        // char 16 bit
        char charA = (char) shortA;
        System.out.println("short to char");
        System.out.println(charA);
        return 0;
    }

    int intConversion() {
        int intA = Integer.MIN_VALUE;
        int intB = Integer.MAX_VALUE;
        System.out.println("Integer Conversions : \n");
        // byte 8 bit
        System.out.println("int to byte");
        byte byteA = (byte) intA;
        byte byteB = (byte) (intA + intB);
        System.out.println(byteA);
        System.out.println(byteB);
        // short 16 bit
        System.out.println("int to short");
        short shortA = (short) intA;
        short shortB = (short) (intA + intB);
        System.out.println(shortA);
        System.out.println(shortB);
        // long 64 bit
        long longA = intA;
        long longB = (long) (intA + intB);
        System.out.println("int to long");
        System.out.println(longA);
        System.out.println(longB);
        // float 32 bit
        float floatA = intA;
        float floatB = (float) (intA + intB);
        System.out.println("int to float");
        System.out.println(floatA);
        System.out.println(floatB);
        // double 32 bit
        double doubleA = intA;
        double doubleB = (double) (intA + intB);
        System.out.println("int to double");
        System.out.println(doubleA);
        System.out.println(doubleB);
        // char 16 bit
        char charA = (char) intA;
        System.out.println("int to char");
        System.out.println(charA);
        return 0;
    }

    long longConversion() {
        long longA = Long.MIN_VALUE;
        long longB = Long.MAX_VALUE;
        System.out.println("Long Conversions : \n");
        // byte 8 bit
        System.out.println("Long to byte");
        byte byteA = (byte) longA;
        byte byteB = (byte) (longA + longB);
        System.out.println(byteA);
        System.out.println(byteB);
        // short 16 bit
        System.out.println("Long to short");
        short shortA = (short) longA;
        short shortB = (short) (longA + longB);
        System.out.println(shortA);
        System.out.println(shortB);
        // int 32 bit
        int intA = (int) longA;
        int intB = (int) (longA + longB);
        System.out.println("Long to int");
        System.out.println(intA);
        System.out.println(intB);
        // float 32 bit
        float floatA = longA;
        float floatB = (float) (longA + longB);
        System.out.println("Long to float");
        System.out.println(floatA);
        System.out.println(floatB);
        // double 32 bit
        double doubleA = longA;
        double doubleB = (double) (longA + longB);
        System.out.println("Long to double");
        System.out.println(doubleA);
        System.out.println(doubleB);
        // char 16 bit
        char charA = (char) longA;
        System.out.println("Long to char");
        System.out.println(charA);
        return 0;
    }

    float floatConversion() {
        float floatA = Float.MIN_VALUE;
        float floatB = Float.MAX_VALUE;
        System.out.println("Float Conversions : \n");
        // byte 8 bit
        System.out.println("float to byte");
        byte byteA = (byte) floatA;
        byte byteB = (byte) (floatA + floatB);
        System.out.println(byteA);
        System.out.println(byteB);
        // short 16 bit
        System.out.println("float to short");
        short shortA = (short) floatA;
        short shortB = (short) (floatA + floatB);
        System.out.println(shortA);
        System.out.println(shortB);
        // int 32 bit
        int intA = (int) floatA;
        int intB = (int) (floatA + floatB);
        System.out.println("float to int");
        System.out.println(intA);
        System.out.println(intB);
        // long 32 bit
        long longA = (long) floatA;
        long longB = (long) (floatA + floatB);
        System.out.println("float to Long");
        System.out.println(longA);
        System.out.println(longB);
        // double 32 bit
        double doubleA = floatA;
        double doubleB = (double) (floatA + floatB);
        System.out.println("float to double");
        System.out.println(doubleA);
        System.out.println(doubleB);
        // char 16 bit
        char charA = (char) floatA;
        System.out.println("float to char");
        System.out.println(charA);
        return 0;
    }

    double doubleConversion() {
        double doubleA = Double.MIN_VALUE;
        double doubleB = Double.MAX_VALUE;
        System.out.println("Double Conversions : \n");
        // byte 8 bit
        System.out.println("double to byte");
        byte byteA = (byte) doubleA;
        byte byteB = (byte) (doubleA + doubleB);
        System.out.println(byteA);
        System.out.println(byteB);
        // short 16 bit
        System.out.println("double to short");
        short shortA = (short) doubleA;
        short shortB = (short) (doubleA + doubleB);
        System.out.println(shortA);
        System.out.println(shortB);
        // int 32 bit
        int intA = (int) doubleA;
        int intB = (int) (doubleA + doubleB);
        System.out.println("double to int");
        System.out.println(intA);
        System.out.println(intB);
        // long 32 bit
        long longA = (long) doubleA;
        long longB = (long) (doubleA + doubleB);
        System.out.println("double to Long");
        System.out.println(longA);
        System.out.println(longB);
        // float 32 bit
        float floatA = (float) doubleA;
        float floatB = (float) (doubleA + doubleB);
        System.out.println("double to Float");
        System.out.println(floatA);
        System.out.println(floatB);
        // char 16 bit
        char charA = (char) doubleA;
        System.out.println("double to char");
        System.out.println(charA);
        return 0;
    }

    char charConversion() {
        char charA = 'a';
        char charB = 'Z';
        System.out.println("Char Conversions : \n");
        // byte 8 bit
        System.out.println("char to byte");
        byte byteA = (byte) charA;
        byte byteB = (byte) (charA + charB);
        System.out.println(byteA);
        System.out.println(byteB);
        // short 16 bit
        System.out.println("char to short");
        short shortA = (short) charA;
        short shortB = (short) (charA + charB);
        System.out.println(shortA);
        System.out.println(shortB);
        // int 32 bit
        int intA = (int) charA;
        int intB = (int) (charA + charB);
        System.out.println("char to int");
        System.out.println(intA);
        System.out.println(intB);
        // long 64 bit
        long longA = (long) charA;
        long longB = (long) (charA + charB);
        System.out.println("char to Long");
        System.out.println(longA);
        System.out.println(longB);
        // float 32 bit
        float floatA = charA;
        float floatB = (float) (charA + charB);
        System.out.println("char to float");
        System.out.println(floatA);
        System.out.println(floatB);
        // double 32 bit
        double doubleA = charA;
        double doubleB = (double) (charA + charB);
        System.out.println("char to double");
        System.out.println(doubleA);
        System.out.println(doubleB);
        return 0;
    }

}
