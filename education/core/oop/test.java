package oop;

public class test {
    public static void main(String[] args) {
//        byte [] b = {1,23,4,5,45,67,89,12,3,9,0,77,66,5,44,89,};
//
//        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(b);
//        System.out.println(asciiCharSequence.charAt(10));
//        System.out.println(asciiCharSequence.toString());
//        System.out.println(asciiCharSequence.subSequence(4,9));

        ComplexNumber c = new ComplexNumber(990.0,977.0);
        ComplexNumber x = new ComplexNumber(977.0,977.0);

        System.out.println(c.equals(x));


    }

   static public class TruthTableExample {
        public static void main(String[] args) {
            boolean A, B;

            System.out.println("A\tB\tA && B");
            System.out.println("-----------------");

            for (int i = 0; i <= 1; i++) {
                for (int j = 0; j <= 1; j++) {
                    A = i == 1;
                    B = j == 1;

                    boolean result = A && B;

                    System.out.println(A + "\t" + B + "\t" + result);
                }
            }
        }
    }


}
