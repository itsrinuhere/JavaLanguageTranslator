import java.io.IOException;
import com.darkprograms.speech.translator.GoogleTranslate;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

public class App {
    private JFrame window = new JFrame("Language Translator");
    JPanel pane = new JPanel();
    JLabel lbl = new JLabel();

    void run() {

        window.setVisible(true);
        window.setLayout(null);
        window.setSize(2080, 820);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("Translator\\src\\pic.jpg");
        img.getIconHeight();
        lbl.setIcon(img);

        lbl.setBounds(0, 0, 2080, 820);

        pane.setBounds(0, 0, 2080, 820);
        pane.setBackground(new Color(0, 234, 123));
        pane.setLayout(null);
        JLabel label1 = new JLabel("Input");
        JLabel lable2 = new JLabel("output");
        label1.setFont(new Font("Adobe Garamond Pro Bold", Font.ITALIC, 50));
        lable2.setFont(new Font("Adobe Garamond Pro Bold", Font.ITALIC, 50));
        JTextArea inputtxt = new JTextArea();
        JTextField outtxt = new JTextField();
        JButton submit = new JButton("Submit");
        label1.setBounds(80, 50, 240, 30);
        lable2.setBounds(750, 50, 240, 30);
        inputtxt.setBackground(Color.black);
        inputtxt.setForeground(Color.white);
        inputtxt.setBounds(32, 120, 570, 550);
        outtxt.setBounds(820, 120, 570, 550);
        submit.setBounds(590, 690, 120, 30);

        outtxt.setBackground(Color.black);
        outtxt.setForeground(Color.white);
        pane.add(submit);
        pane.add(label1);
        pane.add(lable2);
        pane.add(outtxt);
        window.add(pane);
        pane.add(inputtxt);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String var = inputtxt.getText();
                try {
                    outtxt.setText(GoogleTranslate.translate("te", var));
                } catch (Exception w) {
                    JOptionPane.showMessageDialog(window, "Error\t:");
                }
            }
        });

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new App().run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}