/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huncam.components.form.auth;

import com.formdev.flatlaf.FlatClientProperties;
import huncam.view.auth.LoginView;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.JButton;
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
public class RegisterLayout extends JPanel {

    private JTextField txtUsername;
    private JTextField txtEmail;
    private JTextField txtFullName;
    private JPasswordField txtPassword;
    private JPasswordField txtPasswordValidate;
    private JButton cmdRegister;
    private JButton cmdLogin;


    public RegisterLayout() {
        init();
    }

    public void init() {
        setLayout(new MigLayout("fill, insets 20", "[center]", "[center]"));
        txtUsername = new JTextField();
        txtEmail = new JTextField();
        txtPassword = new JPasswordField();
        txtPasswordValidate = new JPasswordField();
        txtFullName = new JTextField();
        cmdRegister = new JButton("Register");


        JPanel panel = new JPanel(new MigLayout("wrap, fillx, insets 35 45 30 45", "fill, 250:280"));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;"
                + "[light]background:darken(@background, 3%);"
                + "[dark]background:lighten(@background, 3%);"
        );
        txtPassword.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true"
        );
        txtPasswordValidate.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true"
        );
        cmdRegister.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]background:darken(@background, 10%);"
                + "[dark]background:lighten(@background, 10%);"
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "font:bold +2;"
                + "innerFocusWidth:0"
        );
        txtFullName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukan nama full anda");
        txtEmail.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukan email anda");
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukan username anda");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukan password anda");
        txtPasswordValidate.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukan kembali password anda");
        JLabel lbTitle = new JLabel("Selamat Datang!");
        JLabel lbSubTitle = new JLabel("Masukan data anda untuk daftarkan akun");
        lbTitle.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +10"
        );
        lbSubTitle.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@foreground, 30%);"
                + "[dark]foreground:darken(@foreground, 30%);"
        );

        panel.add(lbTitle);
        panel.add(lbSubTitle);
        panel.add(new JLabel("Fullname"), "gapy 8");
        panel.add(txtFullName);
        panel.add(new JLabel("Email"), "gapy 8");
        panel.add(txtEmail);
        panel.add(new JLabel("Username"), "gapy 8");
        panel.add(txtUsername);
        panel.add(new JLabel("Password"), "gapy 8");
        panel.add(txtPassword);
        panel.add(new JLabel("Ulangi Password"), "gapy 8");
        panel.add(txtPasswordValidate);
        panel.add(cmdRegister, "gapy 10");
        panel.add(createSignInLbl(), "gapy 10");
        add(panel);
    }

    private Component createSignInLbl() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:null"
        );

        cmdLogin = new JButton("<html><a href=\"#\">Login</a></html>");
        cmdLogin.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,3,3,3"
        );
        cmdLogin.setContentAreaFilled(false);
        cmdLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdLogin.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(this).dispose();

            LoginView loginView = new LoginView();
            loginView.setVisible(true);
        });
        JLabel label = new JLabel("Sudah Memiliki Akun?");
        label.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@foreground, 30%);"
                + "[dark]foreground:darken(@foreground, 30%);"
        );
        panel.add(label);
        panel.add(cmdLogin);
        return panel;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtFullName() {
        return txtFullName;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public JPasswordField getTxtPasswordValidate() {
        return txtPasswordValidate;
    }

    public JButton getCmdRegister() {
        return cmdRegister;
    }

    public JButton getCmdLogin() {
        return cmdLogin;
    }


}
