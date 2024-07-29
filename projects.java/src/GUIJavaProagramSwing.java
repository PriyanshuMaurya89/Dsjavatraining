import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIJavaProagramSwing {
    public static void main(String[] args) {
        // to create a frame using  swing in java
        JFrame frame=new JFrame( "BMI Calculator");
        // create  UI components  for BMi calculator
        JLabel heightLabel=new JLabel( " Enter your Height:");
        JLabel weightLabel=new JLabel( " Enter your Weight:");
        JLabel bmiLabel=new JLabel();
        JTextField heightField=new JTextField();
        JTextField weightField=new JTextField();

        JButton bmiButton=new JButton( " calculate BMI");
        // To set the size and position  of ui  componentsgit
        heightLabel.setBounds(50,50,120,20);
        heightField.setBounds(150,50,50,20);
        weightLabel.setBounds(30,80,120,20);
        weightField.setBounds(150,80,50,20);
        bmiButton.setBounds  (30,130,120,40);
        bmiLabel.setBounds  (170,130,80,40);
        // To attach the label to frame
        frame.add(heightLabel);
        frame.add(heightField);
        frame.add(weightLabel);
        frame.add(weightField);
        frame.add(bmiButton  );
        frame.add(bmiLabel);


        // To build the default layout
        frame.setLayout(null);
        //To set the size for frame
        frame.setSize(300,250);

        // To Visible the frame on Screen
        frame.setVisible(true);
        // to click  on bmi button  to calculate
        bmiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // to apply the bmi formula
                float weight = Float.parseFloat(weightField.getText().toString());
                float height = Float.parseFloat(heightField.getText().toString());
                float output = weight / (height * height);
                if (output < 18.5) {
                    bmiLabel.setText("i am under weight");
                } else if (output > 18.5 && output < 24.5) {
                    bmiLabel.setText(" I am normal");
                } else if (output > 24.9 && output < 29.9) {
                    bmiLabel.setText(" i am overweight");

                }
                else{
                            bmiLabel.setText( " i am obesity");
                    }

                }





        });
    }
}

