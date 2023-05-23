package sk.stuba.fei.uim.oop;

import lombok.Getter;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.Canvas;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
public class Logic extends Adapter{


    @Getter
    private Canvas canvas;

    JSlider lengthSlider;
    JSlider spacingSlider;
    JSlider radiusSlider;

    JComboBox shapes;

    private int shapeId;
    public Logic(JSlider lengthSlider, JSlider spacingSlider, JSlider radiusSlider, JComboBox shapes ){
        this.lengthSlider = lengthSlider;
        this.spacingSlider = spacingSlider;
        this.radiusSlider = radiusSlider;
        this.shapes = shapes;

        canvas = new Canvas(lengthSlider.getValue(),spacingSlider.getValue(),radiusSlider.getValue(), shapeId);
        this.canvas.setBackground(Color.DARK_GRAY);
        this.canvas.addMouseMotionListener(this);
        this.canvas.addMouseListener(this);

    }

    private void resovleShapeId(String s){
        switch (s){
            case "Square":
                this.shapeId=1;
                break;
            case "Circle":
                this.shapeId=2;
                break;

            case "Hourglass":
                this.shapeId=3;
                break;
        }
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == shapes){
            this.resovleShapeId(e.getItem().toString());
            this.canvas.setTailShapeId(this.shapeId);

        }
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() == lengthSlider){
            this.canvas.setTailLength(lengthSlider.getValue());
        }
        if(e.getSource() == radiusSlider){
            this.canvas.setTailRadius(radiusSlider.getValue());
        }
        if(e.getSource() == spacingSlider){
            this.canvas.setTailSpacing(radiusSlider.getValue());
        }


    }
    @Override
    public void mouseEntered(MouseEvent e) {
        this.canvas.addTailCoordinates(e.getX(),e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    @Override
    public void mouseMoved(MouseEvent e) {

        this.canvas.addTailCoordinates(e.getX(),e.getY());
    }
}
