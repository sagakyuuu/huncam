package huncam.components.swing;

import huncam.components.model.Model_Menu;
import huncam.event.EventMenuSelected;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

public class ListMenu<E extends Object> extends JList<E> {
    
    private final DefaultListModel model;
    private int selectedIndex = -1;
    private int overIndex = -1;
    
    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
    }
    
    public ListMenu() {
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    int index = locationToIndex(e.getPoint());
                    Object o = model.getElementAt(index);
                    if (o instanceof Model_Menu) {
                        Model_Menu menu = (Model_Menu) o;
                        if (menu.getType() == Model_Menu.MenuType.MENU) {
                            selectedIndex = index;
                            if (event != null) {
                                event.selected(index);
                            }
                        }
                    } else {
                        selectedIndex = index;
                    }
                    repaint();
                }
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                overIndex = -1;
                repaint();                
            }
            
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int index = locationToIndex(e.getPoint());
                if (index != overIndex) {
                    Object o = model.getElementAt(index);
                    if (o instanceof Model_Menu) {
                        Model_Menu menu = (Model_Menu) o;
                        if (menu.getType() == Model_Menu.MenuType.MENU) {
                            overIndex = index;
                        }
                    } else {
                        overIndex = -1;
                    }
                    repaint();
                }
            }
            
        });
    }
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean selected, boolean focus) {
                Model_Menu data;
                if (value instanceof Model_Menu) {
                    data = (Model_Menu) value;
                } else {
                    data = new Model_Menu("", value + "", Model_Menu.MenuType.EMPTY);
                }
                MenuItem item = new MenuItem(data);
                item.setSelected(selectedIndex == index);
                item.setOver(overIndex == index);
                return item;
            }
            
        };
    }
    
    public void addItem(Model_Menu data) {
        model.addElement(data);
    }
}
