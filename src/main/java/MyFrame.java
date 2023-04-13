import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MyFrame extends JPanel implements GuiInterface{


    int x;
    int y;
    int width;
    int height;

    boolean isDoubleClicked;


    public MyFrame() {
        addMouseMotionListener(this);
        addMouseListener(this);
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image= new ImageIcon("D:\\IntelliJ IDEA 2022.3.1\\lab4_patern\\src\\main\\resources\\TestImage.jpg").getImage();
        width=image.getWidth(null);
        height=image.getHeight(null);
        this.setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRect(x,y,width,height);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX() - width / 2; // устанавливаем новые координаты прямоугольника
        y = e.getY() - height / 2;
        repaint(); // перерисовываем окно
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // not used
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            isDoubleClicked=true;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // not used
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // not used
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // not used
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // not used
    }
}