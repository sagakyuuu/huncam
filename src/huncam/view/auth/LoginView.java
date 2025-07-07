package huncam.view.auth;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import huncam.components.form.auth.LoginLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LoginView extends JFrame {

    public LoginView() {
        init();
    }

    private LoginLayout login;
    
    private void init() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1200, 700));
        setLocationRelativeTo(null);
        login = new LoginLayout();
        setContentPane(login);
    }

    public static void main(String[] args) {
        try {
            FlatRobotoFont.install();
            FlatLaf.registerCustomDefaultsSource("huncam.themes");

            UIManager.put("defultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));

            FlatMacLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize FlatLaf" + ex);

        }
        SwingUtilities.invokeLater(() -> new LoginView().setVisible(true));
    }
}
