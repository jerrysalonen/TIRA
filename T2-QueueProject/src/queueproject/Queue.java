package queueproject;

public class Queue {
    private Stack stack1;
    private Stack stack2;
    private int mSize;

    public Queue() {
        stack1 = new Stack();
        stack2 = new Stack();
        mSize = stack1.getmSize();
    }

    // Kahden pinon avulla lisätään list item pinon pohjalle
    public void enQueue (String aData) {
        while (stack1.getmSize() > 0) {
            ListItem data = stack1.pop();
            stack2.push(data.getmData());
        }

        stack1.push(aData);

        while (stack2.getmSize() > 0) {
            ListItem data = stack2.pop();
            stack1.push(data.getmData());
        }
        mSize ++;
    }

    // Poistetaan lista-alkio jonon edestä, jos jono tyhjä, palautetaan null
    public ListItem deQueue() {
        if (stack1.getmSize() == 0) {
            return null;
        }

        ListItem item = stack1.pop();
        mSize --;
        return item;
    }

    public int getmSize() {
        return mSize;
    }

    @Override
    public String toString() {
        String result = "";

        while (stack1.getmSize() > 0) {
            ListItem data = stack1.pop();
            result += data.getmData() + " ";
            stack2.push(data.getmData());
        }

        while (stack2.getmSize() > 0) {
            ListItem data = stack2.pop();
            stack1.push(data.getmData());
        }
        return result;
    }
}
