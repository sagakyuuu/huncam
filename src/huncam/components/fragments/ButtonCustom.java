package huncam.components.fragments;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;


public class ButtonCustom extends JButton{

   public ButtonCustom(String txt) {
       super(txt);
       
       setBackground(new Color(59,89,182));
       setForeground(Color.WHITE);
       setFont(new Font("Arial", Font.BOLD, 14));
       
       setBorder(BorderFactory.createEmptyBorder(10,25,10,25));
       
       setFocusPainted(false);
   }
    
}
