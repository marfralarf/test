import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout {
    static JLabel nameLabel = new JLabel();
    static JLabel imageLabel = new JLabel();

    public static void main(String[] args) {
    }

    public static void display(Card card) {
        JFrame frame = new JFrame("My app");
        frame.setSize(500, 600);
        frame.setLayout(null);
        JButton drawButton = new JButton("Random");
        drawButton.setBounds(0, 500, 100, 50);

        nameLabel.setBounds(50, 0, 400, 80);
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        nameLabel.setForeground(Color.BLUE);

        imageLabel.setBounds(0, 0, 400, 400); // Size of the image
        JPanel p = new JPanel(null); // Use null layout if you must manually place
        p.setBounds(50, 80, 400, 400);
        p.add(imageLabel);

        frame.add(p);
        frame.add(drawButton);
        frame.add(nameLabel);

            // add event listener for button click
        drawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(true);
            }
        });
        card.setImage(card.image);
        nameLabel.setText(card.name);
    }

}

