/**
 * An IntList is a list of ints.
 */
public class IntList {
    private ConsCell start; // list head, or null
    /**
     * Construct a new IntList given its first ConsCell.
     * @param s the first ConsCell in the list, or null
     */
    public IntList(ConsCell s) {
        start = s;
    }
    /**
     * Cons the given element h onto us and return the
     * resulting IntList.
     * @param h the head int for the new list
     * @return the IntList with head h, and us as tail
     */
    public IntList cons (int h) {
        return new IntList(new ConsCell(h,start));
    }
    /**
     * Get our length.
     * @return our int length
     */
    public int length() {
        int len = 0;
        ConsCell cell = start;
        while (cell != null) { // while not at end of list
            len++;
            cell = cell.getTail();
        }
        return len;
    }
}
