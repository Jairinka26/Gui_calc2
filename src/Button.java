import javax.swing.*;
import java.awt.*;

public class Button {
    JButton Button (String name){
        JButton button = new JButton(name);
        button.setSize(50,50);
        button.setFont(new Font("Arial",Font.BOLD,20));
        button.addActionListener(e -> {

        });
        return button;
    }
}
