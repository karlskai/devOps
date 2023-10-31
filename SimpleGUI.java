import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JButton
        JButton button = new JButton("Click Me");
        button.setBounds(100, 50, 100, 40);

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a message dialog when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set the frame to be visible
        frame.setLayout(null);  // For simplicity, we use absolute positioning
        frame.setVisible(true);
    }
}
