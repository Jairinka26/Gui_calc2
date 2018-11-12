import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    Double result,firstValue=0.0,secondValue=0.0;
    String action;
    Button button = new Button();
    JButton button1 = button.Button("1");
    JButton button2 = button.Button("2");
    JButton button3 = button.Button("3");
    JButton button4 = button.Button("4");
    JButton button5 = button.Button("5");
    JButton button6 = button.Button("6");
    JButton button7 = button.Button("7");
    JButton button8 = button.Button("8");
    JButton button9 = button.Button("9");
    JButton button0 = button.Button("0");
    JButton buttonC = button.Button("C");
    JButton buttonEqual = button.Button("=");
    JButton buttonPlus = button.Button("+");
    JButton buttonMinus = button.Button("-");
    JButton buttonMultiple = button.Button("*");
    JButton buttonDivision = button.Button("/");
    JFrame frame = new JFrame("Calculator");
    JTextField text = new JTextField();
    JPanel panel = new JPanel();



    void createFraim(){


        frame.setSize(270,365);
        frame.setVisible(true);
        frame.setBackground(Color.BLUE);
        frame.setForeground(Color.BLUE);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.add(panel);

        panel.setLayout(null);

        panel.add(text);
        text.setBounds(10,10,230,50);
        text.setFont(new Font("Arial",Font.BOLD,25));
        text.isEditable();

        panel.add(button1);
        button1.setLocation(10, 70);
        panel.add(button2);
        button2.setLocation(70,70);
        panel.add(button3);
        button3.setLocation(130,70);
        panel.add(buttonPlus);
        buttonPlus.setLocation(190,70);
        panel.add(button4);
        button4.setLocation(10,130);
        panel.add(button5);
        button5.setLocation(70,130);
        panel.add(button6);
        button6.setLocation(130,130);
        panel.add(buttonMinus);
        buttonMinus.setLocation(190,130);
        panel.add(button7);
        button7.setLocation(10,190);
        panel.add(button8);
        button8.setLocation(70,190);
        panel.add(button9);
        button9.setLocation(130,190);
        panel.add(buttonMultiple);
        buttonMultiple.setLocation(190,190);
        panel.add(buttonC);
        buttonC.setLocation(10,250);
        panel.add(button0);
        button0.setLocation(70,250);
        panel.add(buttonEqual);
        buttonEqual.setLocation(130,250);
        panel.add(buttonDivision);
        buttonDivision.setLocation(190,250);

    }
    void listner(){
        button1.addActionListener(e -> text.setText("1"));
        button2.addActionListener(e -> text.setText("2"));
        button3.addActionListener(e -> text.setText("3"));
        button4.addActionListener(e -> text.setText("4"));
        button5.addActionListener(e -> text.setText("5"));
        button6.addActionListener(e -> text.setText("6"));
        button7.addActionListener(e -> text.setText("7"));
        button8.addActionListener(e -> text.setText("8"));
        button9.addActionListener(e -> text.setText("9"));
        button0.addActionListener(e -> text.setText("0"));

        buttonPlus.addActionListener(e -> {
            firstValue = Double.parseDouble (text.getText());
            action = "+";
            text.setText("");
        });

        buttonMinus.addActionListener(e -> {
            firstValue = Double.parseDouble (text.getText());
            action = "-";
            text.setText("");
        });

        buttonMultiple.addActionListener(e -> {
            firstValue = Double.parseDouble (text.getText());
            action = "*";
            text.setText("");
        });

        buttonDivision.addActionListener(e -> {
            firstValue = Double.parseDouble (text.getText());
            action = "/";
            text.setText("");
        });

        buttonEqual.addActionListener(e -> {
            secondValue = Double.parseDouble(text.getText());
            if (firstValue != 0.0) {
                result = executeaction(action, firstValue, secondValue);
                text.setText(Double.toString(result));
            }
            firstValue = 0.0;
            secondValue = 0.0;
        });

        buttonC.addActionListener(e -> {
            text.setText("");
            firstValue=0.0;
            secondValue=0.0;
        });

    }

    double executeaction(String action, Double firstValue, Double secondValue){
        switch (action){
            case  "+" :
                result = firstValue + secondValue ;
                break;

            case "-" :
                result = firstValue - secondValue ;
                break;

            case "*" :
                result = firstValue * secondValue ;
                break;
            case "/" :
                result = firstValue / secondValue ;
                break;
        }

        return result;
    }
}

