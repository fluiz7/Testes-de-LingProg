public class principal {
    public static void main(String[] args) {
        IntList a = new IntList(new ConsCell(3, null));
        ConsCell b = new ConsCell(5, null);
        ConsCell c = new ConsCell(6, null);
        System.out.print(b.getTail());
        b.setTail(c);
        System.out.print(b.getTail());


    }
}
