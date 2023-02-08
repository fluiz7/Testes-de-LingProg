public class main {
    public static void main(String[] args) {
        abstract class C1 implements drawable{

        }
        abstract class C2 extends C1 implements Worklist{

        }
        abstract class C3 implements drawable{

        }
        C1 c1 = null;
        C2 c2 = null;
        C3 c3 = null;
        drawable i1 = null;
        Worklist i2 = null;

        c1 = c2;
        //c1 = c3;
        c1 = (C1) i1;
        c1 = (C1) i2;

        c2 = (C2) c1;
        //c2 = c3;
        c2 = (C2) i1;
        c2 = (C2) i2;

        // c3 = c1;
        // c3 = c2;
        c3 = (C3) i1;
        c3 = (C3) i2;

        i1 = c1;
        i1 = c2;
        i1 = c3;
        i1 = (drawable) i2;

        i2 = (Worklist) c1;
        i2 = c2;
        i2 = (Worklist) c3;
        i2 = (Worklist) i1;

        c2 = (C2) i1;
    }

}
