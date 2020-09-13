import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Problem2 {
    private JButton button;
    private JLabel label;

    public Problem2(){
        JFrame frame = new JFrame("Christmas");

        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();

        panel.setPreferredSize(new Dimension(500,100));
        panel1.setPreferredSize(new Dimension(500,350));

        button = new JButton("Is it Christmas");
        label = new JLabel("");

        panel.add(button);
        panel1.add(label);
        frame.add(panel,BorderLayout.NORTH);
        frame.add(panel1,BorderLayout.SOUTH);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDate today = LocalDate.now();
                if(String.valueOf(today) == "2020-12-25"){
                    label.setText("Yes");
                }
                else{
                    label.setText("No");
                }
            }
        });


        frame.addWindowFocusListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        frame.setTitle("Christmas");
        frame.pack();
        frame.setVisible(true);



    }

    public static void main(String args[]){
        new Problem2();
    }

}
