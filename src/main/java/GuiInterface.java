import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public interface GuiInterface extends MouseMotionListener, MouseListener {
    void paintComponent(Graphics g);
    @Override
    void mouseDragged(MouseEvent e);

    @Override
    void mouseMoved(MouseEvent e);

    @Override
    void mouseClicked(MouseEvent e);

    @Override
    void mousePressed(MouseEvent e);

    @Override
    void mouseReleased(MouseEvent e);

    @Override
    void mouseEntered(MouseEvent e);

    @Override
    void mouseExited(MouseEvent e);
}
