package stackproject;

import java.util.EmptyStackException;

public class Stack {
    private ListItem[] arr;
    private int sSize;
    private int mSize;
    private int index = 0;

    public Stack(int sSize) {
        this.sSize = sSize;
        this.mSize = 0;
        this.arr = new ListItem[sSize];
    }

    public StackIterator iterator() {
        return new StackIterator(this);
    }

    public int getmSize() {
        return mSize;
    }

    public void setmSize(int mSize) {
        this.mSize = mSize;
    }


    public void push (String aData) {
        if (isFull()) {
            throw new StackOverflowError("No room in stack.");
        }

        ListItem newItem = new ListItem();
        newItem.setmData(aData);

        if (index != 0) {
            newItem.setmNext(arr[index - 1]);
        } else {
            newItem.setmNext(null);
        }

        mSize ++;
        setmSize(mSize);

        arr[index] = newItem;
        index++;
    }

    public ListItem pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        mSize--;
        setmSize(mSize);
        return arr[--index];
    }

    public ListItem peek() {
        return arr[index - 1];
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }

        return false;
    }

    public boolean isFull() {
        if (index == sSize) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "";
    }
}
