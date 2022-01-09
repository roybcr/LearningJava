public class Main {

    public static void main(String[] args) {

        System.out.println("For call necklace(1), result is " + Necklace.necklace(1));
        System.out.println("For call necklace(2), result is " + Necklace.necklace(2));
        System.out.println("For call necklace(3), result is " + Necklace.necklace(3));
        System.out.println("For call necklace(4), result is " + Necklace.necklace(4));
        System.out.println("For call necklace(6), result is " + Necklace.necklace(6));

        System.out.println("For call strings(1), result is " + Strings.strings(1));
        System.out.println("For call strings(2), result is " + Strings.strings(2));
        System.out.println("For call strings(3), result is " + Strings.strings(3));

        byte z = (byte) 0;
        byte o = (byte) 1;

        OddSeeker os1 = new OddSeeker(z);
        OddSeeker os2 = new OddSeeker(o);

        os1.setName("TOR");
        os2.setName("TED");

        for (int j = 0; j < 100; j++) {
            os1.run();
            os2.run();
        }

    }

}
