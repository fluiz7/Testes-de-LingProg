public class principal {
    public static void main(String[] args) {
        IntList a = new IntList(new ConsCell(1, null));
        ConsCell c = new ConsCell(3, null);
        ConsCell b = new ConsCell(2, c);
        a.print();
        a.append(b);
        a.print();


    }
}
