public class Exercise14{
    public static void main(String[] args) {
        System.out.printf("Mr Chekov, warp 4, engage ...\n\n");

        HeapManager m = new HeapManager(new int[10]);
        // BestFit m = new BestFit(new int[10]);

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

        System.out.printf("\nDropping warp.\n");
    }
}