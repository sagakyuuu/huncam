package huncam.components.model;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.*;

public class Model_Menu {

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public MenuType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(MenuType type) {
        this.type = type;
    }

    public Model_Menu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public Model_Menu() {
    }

    private String icon;
    private String name;
    private MenuType type;

    public Icon toIcon() {
        ImageIcon icn = new ImageIcon(getClass().getResource("/huncam/assets/icons/" + icon + ".png"));
        Image img = icn.getImage();
        
        if (icn.getImage() == null) {
            System.err.println("Gagal memuat ikon: " + icon + ".png");
            // Kembalikan ikon default atau null, tergantung kebutuhan aplikasi Anda
            return new ImageIcon(); // Mengembalikan ikon kosong
        }
        
        Image scaledImage = img.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

    public static enum MenuType {
        TITLE, MENU, EMPTY;
    }
}
