package stackproject;

public class Stack {
    private ListItem mTop;
    private int mSize;

    public Stack() {
        mTop = null;
        mSize = 0;
    }

    public Stack(ListItem mTop, int mSize) {
        this.mTop = mTop;
        this.mSize = mSize;
    }

    public ListItem getmTop() {
        return mTop;
    }

    public void setmTop(ListItem mTop) {
        this.mTop = mTop;
    }

    public int getmSize() {
        return mSize;
    }

    public void setmSize(int mSize) {
        this.mSize = mSize;
    }

    // Muodostetaan uusi lista-alkio, asetetaan se pinon huipulle
    public void push (String aData) {
        ListItem newmTop = new ListItem();
        newmTop.setmData(aData);
        newmTop.setmNext(mTop);
        mTop = newmTop;
        mSize ++;
    }

    // Poistetaan lista-alkio pinon huipulta, jos pino tyhjä, palautetaan null
    public ListItem pop() {
        if (mSize == 0) {
            return null;
        } else {
            ListItem tempTop = mTop;
            mTop = mTop.getmNext();
            mSize --;
            return tempTop;
        }
    }

    @Override
    public String toString() {
        return "";
    }
}
