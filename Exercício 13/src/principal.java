public class principal {
    public static void main(String[] args) {
        IntList a = new IntList(new ConsCell(1, null));
        ConsCell c = new ConsCell(3, null);
        IntList b = new IntList(new ConsCell(2, c));
        b = b.appendR(a);
        b.print();



    }
}
