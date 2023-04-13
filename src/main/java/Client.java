import javax.swing.*;


public class Client {
    public static void main(String[] args) throws InterruptedException{
        JFrame frame=new JFrame("прямоугольник");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyFrame myFrame=new MyFrame();
        frame.add(myFrame);
        frame.setSize(1600,900);
        frame.setVisible(true);
        while (true) {
            Thread.sleep(1);
            if (myFrame.isDoubleClicked) {
                MyFrameProxy myFrameProxy = new MyFrameProxy();
                frame.add(myFrameProxy);
                myFrameProxy.x= myFrame.x;
                myFrameProxy.y=myFrame.y;
                myFrame.setVisible(false);
            }
        }
    }
}
