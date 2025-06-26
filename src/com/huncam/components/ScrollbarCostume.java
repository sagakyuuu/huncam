package com.huncam.components;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollbarCostume extends JScrollBar {
    
    public ScrollbarCostume() {
        setUI(new Scrollbar());
        setPreferredSize(new Dimension(8, 9));
        setForeground(new Color(48, 144, 216));
        setBackground(Color.white);
        
    }
    
}
