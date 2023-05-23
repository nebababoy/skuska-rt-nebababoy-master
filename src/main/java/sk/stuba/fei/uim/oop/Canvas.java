package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    private Tail tail;

    public Canvas(int chainLength,int spacing, int shapeRadius, int shapeID) {
        tail = new Tail(chainLength,spacing,shapeRadius, shapeID);
    }

    public void setTailShapeId(int id){
        this.tail.setShapeId(id);
        this.tail.changeShapes();
        repaint();
    }
    public void setTailLength(int length){
        tail.setChainLength(length);
        repaint();
    }

    public void setTailSpacing(int spacing){
        tail.setSpacing(spacing);
        repaint();
    }

    public void setTailRadius(int radius){
        this.tail.setRadius(radius);
        this.tail.changeShapesRadius();
        repaint();
    }
    public void addTailCoordinates(int x, int y){
        this.tail.addCoordinates(x,y);
        repaint();
    }
    public void removeAllChainCoordinates(){
        this.tail.removeAllShapes();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.tail.draw(g);
    }
}
