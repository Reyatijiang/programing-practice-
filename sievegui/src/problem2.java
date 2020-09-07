import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

public class problem2 implements ActionListener {
    private int num = 0;
    private JButton button;
    private JTextField textField;
    private JLabel lable;


    public problem2(){
        JFrame frame = new JFrame("Calculator");
        lable = new JLabel("Enter a number between 1 to 10000");

        button = new JButton("enter");
        textField = new JTextField();

        button.addActionListener(this);
        lable.setPreferredSize(new Dimension(300, 200));

        textField.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(lable);
        panel.add(button);
        frame.add(textField);


        frame.add(panel,BorderLayout.SOUTH);


        frame.addWindowFocusListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        frame.setTitle("calculator");
        frame.pack();
        frame.setVisible(true);





    }

    public static void main(String args[]){
        new problem2();


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String number = textField.getText();
        int n = Integer.parseInt(number);
        String ans = "";
        int[] index = new int[n+1];
        boolean[] arr = new boolean[n+1];

        Arrays.fill(arr,Boolean.TRUE);

        for(int i = 2; i*i < n+1; i++) {

            if (arr[i] == Boolean.TRUE) {
                for (int j = i * i; j < n+1; j = j + i) {

                    arr[j] = Boolean.FALSE;

                }

            }

        }
        System.out.println(arr.length);


        if(arr[arr.length-1] == Boolean.TRUE){
            ans = " Yes it is a prime number ";
        }
        else {
            ans = " No it is not a prime number ";

        }
        int num = Integer.parseInt(number);
        lable.setText(ans);
        System.out.println(ans);

    }
}
