import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

public class Problem1{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JLabel text1;
    private JLabel text2;
    private JLabel text3;
    private JLabel text4;
    private JLabel text5;
    private JLabel text6;

    //Documentation: For this Project, I am building the interface with the emphasis of functionality. Each button has
    // a Actionlistener that modifies a label that contains all the ordered food. The GUI is simple but resemble the core
    //functionalities of a restaurant order services


    public Problem1(){
        JFrame frame = new JFrame("Bespoke");


        JPanel panel = new JPanel();

        button1 = new JButton("Dim Sum");
        button2 = new JButton("Dumpling");
        button3 = new JButton("KongPao Chicken");
        button4 = new JButton("Noodle");
        button5 = new JButton("Bespoke");
        button6 = new JButton("Clear");






        JPanel panel1 = new JPanel();
        frame.add(panel1,BorderLayout.NORTH);
        panel1.setPreferredSize(new Dimension(600, 100));
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);

        frame.add(panel,BorderLayout.SOUTH);
        panel.setPreferredSize(new Dimension(600, 100));
        text1 = new JLabel("Cart: ");
        text2 = new JLabel("");
        text3 = new JLabel("");
        text4 = new JLabel("");
        text5 = new JLabel("");
        text6 = new JLabel("");

        panel.add(text1);
        panel.add(text2);
        panel.add(text3);
        panel.add(text4);
        panel.add(text5);
        panel.add(text6);
        panel.add(button6);




        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                text2.setText("Dim Sum.");
                text2.setForeground(Color.RED);

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                text3.setText("Dumpling.");
                text3.setForeground(Color.RED);

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                text4.setText("KongPao Chicken.");
                text4.setForeground(Color.RED);

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                text5.setText("Noodles.");
                text5.setForeground(Color.RED);

            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                text2.setText("");
                text3.setText("");
                text4.setText("");
                text5.setText("");
                text6.setText("");

            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                text5.setText("");
                text6.setText("");
                text4.setText("Noodles.");
                text3.setText("KongPao Chicken.");
                text2.setText("Dim Sum.");

                text2.setForeground(Color.RED);
                text3.setForeground(Color.RED);
                text4.setForeground(Color.RED);



            }
        });

        frame.addWindowFocusListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        frame.setTitle("Bespoke");
        frame.pack();
        frame.setVisible(true);

    }



    public static void main(String args[]){
        new Problem1();
    }

}
