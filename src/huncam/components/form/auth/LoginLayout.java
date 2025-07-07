/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huncam.components.form.auth;

import com.formdev.flatlaf.FlatClientProperties;
import huncam.view.auth.RegisterView;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author ssint
 */
public class LoginLayout extends JPanel{
    
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton cmdLogin;
    private JCheckBox chRememberMe;
    private JButton cmdRegister;
    
    public LoginLayout() {
        init();
    }
    
    public void init() {
        setLayout(new MigLayout("fill, insets 20", "[center]", "[center]"));
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        chRememberMe = new JCheckBox("Remember me");
        cmdLogin = new JButton("Login");
        JPanel panel = new JPanel(new MigLayout("wrap, fillx, insets 35 45 30 45", "fill, 250:280"));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;"
                + "[light]background:darken(@background, 3%);"
                + "[dark]background:lighten(@background, 3%);"
        );

        txtPassword.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true"
        );
        cmdLogin.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +2;"
                + "[light]background:darken(@background, 10%);"
                + "[dark]background:lighten(@background, 10%);"
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "innerFocusWidth:0"
        );

        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukan email atau username anda");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukan password anda");
        JLabel lbTitle = new JLabel("Selamat Datang!");
        JLabel lbSubTitle = new JLabel("Masukan data anda untuk akses akun");
        lbTitle.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +10"
        );
        lbSubTitle.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@foreground, 30%);"
                + "[dark]foreground:darken(@foreground, 30%);"
        );
        panel.add(lbTitle);
        panel.add(lbSubTitle);
        panel.add(new JLabel("Username"), "gapy 8");
        panel.add(txtUsername);
        panel.add(new JLabel("Password"), "gapy 8");
        panel.add(txtPassword);
        panel.add(chRememberMe, "grow 0");
        panel.add(cmdLogin, "gapy 10");
        panel.add(createSignUpLbl(), "gapy 10");
        add(panel);
    }
    
    private Component createSignUpLbl() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:null"
        );

        cmdRegister = new JButton("<html><a href=\"#\">Register</a></html>");
        cmdRegister.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,3,3,3"
        );
        cmdRegister.setContentAreaFilled(false);
        cmdRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdRegister.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(this).dispose();

            RegisterView registerView = new RegisterView();
            registerView.setVisible(true);
        });
        JLabel label = new JLabel("Tidak Memiliki Akun?");
        label.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@foreground, 30%);"
                + "[dark]foreground:darken(@foreground, 30%);"
        );
        panel.add(label);
        panel.add(cmdRegister);
        return panel;
    }


    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public JButton getCmdLogin() {
        return cmdLogin;
    }

    public JButton getCmdRegister() {
        return cmdRegister;
    }
}
