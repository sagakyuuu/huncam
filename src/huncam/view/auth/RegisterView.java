/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huncam.view.auth;

import huncam.components.form.auth.RegisterLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author ssint
 */
public class RegisterView extends JFrame{
    
    private RegisterLayout registerLayout;
    
    public RegisterView() {
        init();
    }
    
    private void init() {
        setTitle("Register");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1200, 700));
        setLocationRelativeTo(null);

        registerLayout = new RegisterLayout();

        setContentPane(registerLayout);
    }
}
