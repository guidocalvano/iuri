import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

class Surface extends JPanel  implements ActionListener 
{

    private final int DELAY = 20;
    private Timer timer;

    Game game;

    public Surface() {}

    public Surface init(Game game)
    {
        this.game = game;

        timer = new Timer(DELAY, this); 

        return this;
    }

    private void drawFrame(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        Frame f = new Frame().init(g2d, getWidth(), getHeight());

        game.drawFrame(f);
    }

    public void start()
    {
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        drawFrame(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
