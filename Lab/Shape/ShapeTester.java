/**
 * Main class of the Java program.
 */

public class ShapeTester {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Shape t1 = new Triangle("White", 2, 4);
        t1.use();
        System.out.println(t1);

        Triangle t2 = new Equilateral();
        System.out.println(t2);
        Equilateral r = (Equilateral) t2;
        System.out.println("R: " + r);
        System.out.println(t2 instanceof Triangle);
        System.out.println(t2 instanceof Equilateral);

        Equilateral e1 = new Equilateral();
        e1.use();

        System.out.println(e1 instanceof Triangle);
        System.out.println(e1 instanceof Equilateral);

        System.out.println("-----------------------------------------------");
        Equilateral e2 = new Equilateral("Blue", 10, 10);
        e2.toString();

        Equilateral e = new Equilateral();
        e.use();

        Shape g = new Equilateral();
        Triangle f = (Triangle) g;
        System.out.println(f.getClass());
        System.out.println(f.hashCode());

        Equilateral q = new Equilateral();
        Triangle t = (Triangle) q;
        Shape ss = (Triangle) q;
        Triangle b = q;
        System.out.println("B: " + (b instanceof Equilateral));
        Equilateral p = (Equilateral) f;
        System.out.println(p.hashCode());

        Shape u = p;
        System.out.println(u);

        System.out.println(t.hashCode());
        System.out.println(ss.hashCode());
        System.out.println(t instanceof Triangle);
        System.out.println(ss instanceof Triangle);
        System.out.println(ss instanceof Equilateral);
        System.out.println(ss instanceof Shape);

        Shape[] s3 = new Shape[2];
        s3[0] = new Triangle();
        s3[1] = new Equilateral();

        for (int i = 0; i < 2; i++) {

            s3[i].use();

        }
    }
}
