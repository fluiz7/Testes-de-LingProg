public class principal {
    public static void main(String[] args) {
        ConsCell a = null;
        ConsCell b = new ConsCell(2, a);
        ConsCell c = new ConsCell(1, b);
        System.out.println(c);
    }
}
