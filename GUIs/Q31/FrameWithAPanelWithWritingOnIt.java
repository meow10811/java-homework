import javax.swing.*;
import java.awt.*;

public class FrameWithAPanelWithWritingOnIt{
    public static void main(String[] args) {
        Frame31 f = new Frame31();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

class Frame31 extends JFrame{
    private static final long serialVersionUID = 420;
    public Frame31(){
        setTitle("31 rocks!");
        setSize(300,200);
        setLocation(100,200);

        Panel31 panel = new Panel31();
        Container cp = getContentPane();
        cp.add(panel);
    }
}

class Panel31 extends JPanel{
    private static final long serialVersionUID = 420;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Hi",75,100);
    }
}
