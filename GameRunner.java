import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.Timer;

public class GameRunner extends JFrame {

    Surface surface;

    public GameRunner() {

        initUI();
    }

    private void initUI() {

        surface = new Surface().init(new Game());

        add(surface);

        setTitle("Simple Java 2D example");
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        surface.start();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                GameRunner ex = new GameRunner();
                ex.setVisible(true);
            }
        });
    }
}