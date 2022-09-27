import javax.swing.*;
public class Snake extends JFrame{
    Snake(){
        add(new Board());
        pack();
        setLocationRelativeTo(null);
        // Disable maximize option
        setResizable(false);
        setTitle("Feed The Snake");
    }

    public static void main(String[] args) {
        // Created the frame and set visibility true
       new Snake().setVisible(true);
    }
}
