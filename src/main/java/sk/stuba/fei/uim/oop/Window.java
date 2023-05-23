package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Window {
    JComboBox shapes;
    JSlider radiusSlider;

    JSlider lengthSlider;
    JSlider spacingSlider;

    public Window(){




        JFrame frame = new JFrame("2023 Skuska");
        frame.setSize(700,700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

      //  Canvas canvas = new Canvas();


        JPanel sideMenu = new JPanel();
        sideMenu.setLayout(new BorderLayout());
        sideMenu.setFocusable(false);


        JPanel sliderLabels = new JPanel();
        sliderLabels.setLayout(new GridLayout(1,3));
        JLabel length = new JLabel("Length");
        JLabel radius = new JLabel("Radius");
        JLabel spacing = new JLabel("Spacing");
        sliderLabels.add(length);
        sliderLabels.add(radius);
        sliderLabels.add(spacing);
        sliderLabels.setFocusable(false);

        JPanel sliderMenu = new JPanel();
        sliderMenu.setLayout(new GridLayout(1,3));

        lengthSlider = new JSlider(JSlider.VERTICAL,20,200,50);
        lengthSlider.setSnapToTicks(true);
        lengthSlider.setMajorTickSpacing(10);
        lengthSlider.setMinorTickSpacing(10);
        lengthSlider.setPaintTicks(true);
        lengthSlider.setPaintLabels(true);
        lengthSlider.setFocusable(false);


        radiusSlider = new JSlider(JSlider.VERTICAL,1,20,5);
        radiusSlider.setSnapToTicks(true);
        radiusSlider.setMajorTickSpacing(1);
        radiusSlider.setMinorTickSpacing(1);
        radiusSlider.setPaintTicks(true);
        radiusSlider.setPaintLabels(true);
        radiusSlider.setFocusable(false);


        spacingSlider = new JSlider(JSlider.VERTICAL,1,20,5);
        spacingSlider.setSnapToTicks(true);
        spacingSlider.setMajorTickSpacing(1);
        spacingSlider.setMinorTickSpacing(1);
        spacingSlider.setPaintTicks(true);
        spacingSlider.setPaintLabels(true);
        spacingSlider.setFocusable(false);


        sliderMenu.add(lengthSlider);
        sliderMenu.add(radiusSlider);
        sliderMenu.add(spacingSlider);
        sliderMenu.setFocusable(false);







//                sliderLabels.add(logic.getLengthLabel());
//                sliderLabels.add(logic.getRadiusLabel());
//                sliderLabels.add(logic.getSpacingLabel());
//
//
//                JPanel sliderMenu = new JPanel();
//                sliderMenu.setLayout(new GridLayout(1,3));
//                sliderMenu.add(logic.getLengthSlider());
//                sliderMenu.add(logic.getRadiusSlider());
//                sliderMenu.add(logic.getSpacingSlider());
//                sliderMenu.setFocusable(false);
//
//                sideMenu.add(sliderLabels,BorderLayout.PAGE_START);
//                sideMenu.add(sliderMenu,BorderLayout.CENTER);
//                sideMenu.add(logic.getComboBox(),BorderLayout.PAGE_END);
//
//                frame.add(sideMenu,BorderLayout.EAST);
//                frame.add(logic.getCanvas(),BorderLayout.CENTER);
//
//
//                frame.setVisible(true);
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(700, 770);
//        frame.setLayout(new BorderLayout());
//        frame.setResizable(false);
//        frame.setFocusable(true);
//        frame.requestFocusInWindow();
//        frame.setLocationRelativeTo(null);


       // JPanel canvas = new JPanel();





//        JPanel sliderLabels = new JPanel();
//        sliderLabels.setLayout(new GridLayout(1,3));




        String shapess[]={"circle", "square", "hourglass"};
        shapes = new JComboBox(shapess);

        Logic logic = new Logic(lengthSlider, spacingSlider,  radiusSlider, shapes);

        lengthSlider.addChangeListener(logic);
        radiusSlider.addChangeListener(logic);
        spacingSlider.addChangeListener(logic);
//




        sideMenu.add(sliderLabels,BorderLayout.PAGE_START);
        sideMenu.add(sliderMenu,BorderLayout.CENTER);
        sideMenu.add(shapes,BorderLayout.PAGE_END);


        frame.add(sideMenu, BorderLayout.EAST);
        frame.add(logic.getCanvas(), BorderLayout.CENTER);
       // frame.add(canvas, BorderLayout.CENTER);



        frame.setVisible(true);



    }

//    public String getShape(){
//        return (String) shapes.getItemAt(shapes.getSelectedIndex());
//    }


}

//    JFrame frame = new JFrame("2022 Skuska OT");
//        frame.setSize(800,800);
//                frame.setResizable(false);
//                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//                frame.setLayout(new BorderLayout());
//
//                GameLogic logic = new GameLogic();
//
//                JPanel sideMenu = new JPanel();
//                sideMenu.setLayout(new BorderLayout());
//                sideMenu.setFocusable(false);
//
//                JPanel sliderLabels = new JPanel();
//                sliderLabels.setLayout(new GridLayout(1,3));
//                sliderLabels.add(logic.getLengthLabel());
//                sliderLabels.add(logic.getRadiusLabel());
//                sliderLabels.add(logic.getSpacingLabel());
//                sliderLabels.setFocusable(false);
//
//                JPanel sliderMenu = new JPanel();
//                sliderMenu.setLayout(new GridLayout(1,3));
//                sliderMenu.add(logic.getLengthSlider());
//                sliderMenu.add(logic.getRadiusSlider());
//                sliderMenu.add(logic.getSpacingSlider());
//                sliderMenu.setFocusable(false);
//
//                sideMenu.add(sliderLabels,BorderLayout.PAGE_START);
//                sideMenu.add(sliderMenu,BorderLayout.CENTER);
//                sideMenu.add(logic.getComboBox(),BorderLayout.PAGE_END);
//
//                frame.add(sideMenu,BorderLayout.EAST);
//                frame.add(logic.getCanvas(),BorderLayout.CENTER);
//
//
//                frame.setVisible(true);
