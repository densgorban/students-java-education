package sort;

import java.awt.*;

public class Auto implements Comparable{

    int size;
    Color color;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int compareTo(Object o) {
        return this.size - ((Auto)o).getSize();
    }
}
