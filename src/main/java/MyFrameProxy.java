import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;

public class MyFrameProxy extends JPanel implements GuiInterface{
    int x;
    int y;

    MyFrame myFrame=new MyFrame();

    public MyFrameProxy() {
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image= new ImageIcon("D:\\IntelliJ IDEA 2022.3.1\\lab4_patern\\src\\main\\resources\\TestImage.jpg").getImage();
        myFrame.setBackground(Color.white);
        g.drawImage(image, x, y,null);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX() - myFrame.width / 2; // устанавливаем новые координаты прямоугольника
        y = e.getY() - myFrame.height / 2;
        repaint(); // перерисовываем окно
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // not used
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // not used
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

