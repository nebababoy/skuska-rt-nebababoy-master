package sk.stuba.fei.uim.oop;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

public class Shapes {
    @Getter
    protected int x;
    @Getter
    protected int y;
    @Setter
    protected int radius;
    @Setter
    protected Color color = Color.red;

    public void draw(Graphics g){


    }
    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
}
