public class Exercise14{
    public static void main(String[] args) {
        System.out.printf("Mr Chekov, warp 4, engage ...\n\n");

        // Exercício 14 referente a alteração para a letra (a).
        BestFit m = new BestFit(new int[10]);

        int p1, p2, p3;

        m.echo();

        p1=m.allocate(4);
        System.out.printf("\np1 = %d, size = %d\n",p1,4);
        m.echo();

        p2=m.allocate(4);
        System.out.printf("\np2 = %d, size = %d\n",p2,4);
        m.echo();

        m.deallocate(p1);
        System.out.printf("\nDeallocating p1\n");
        m.echo();

        m.deallocate(p2);
        System.out.printf("\nDeallocating p2\n");
        m.echo();

        p3=m.allocate(7);
        System.out.printf("\np3 = %d, size = %d\n",p3,7);
        m.echo();


        // Exercício 14 referente a alteração para a letra (b), de modo a dar erro no first e certo no best.

        BestFit mm = new BestFit(new int[7]);
        int a = mm.allocate(2);
        int b = mm.allocate(1);
        int c = mm.allocate(1);
        mm.deallocate(a);
        mm.deallocate(c);
        int d = mm.allocate(1);
        int e = mm.allocate(2);

        // Exercício 14 referente a alteração para a letra (c), de modo a dar erro no best e certo no first.

        //BestFit mm = new BestFit(new int[11]);

        //int a = mm.allocate(4);
        //int b = mm.allocate(1);
        //int c = mm.allocate(3);
        //mm.deallocate(a);
        //mm.deallocate(c);
        //int d = mm.allocate(2);
        //int e = mm.allocate(1);
        //int f = mm.allocate(3);
        //mm.echo();

        System.out.printf("\nDropping warp.\n");
    }
}