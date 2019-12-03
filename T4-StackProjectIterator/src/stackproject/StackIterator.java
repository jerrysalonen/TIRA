package stackproject;

interface Iterator {
    boolean hasNext();
    Object next();
}

public class StackIterator implements Iterator {
    private ListItem current;
    private Stack container; // container on tietorakenne, jota iteroidaan

    StackIterator (Stack c) { // konstruktori on "package visible"
        container = c;
        current = container.peek();
    }

    public boolean hasNext() {
        if (current == null)
            return false;
        else
            return true;
    }

    public ListItem next() {
        ListItem old = current;
        current = current.getmNext();
        return old;
    }

}