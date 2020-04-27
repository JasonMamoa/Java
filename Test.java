import java.awt.*;
import javax.swing.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


class Main {
    public static void main(final String[] args) {
    window.createWindow();

}
}
 class window {
    public static void createWindow(){
        String tmp = Variables.name;
        JFrame frame = new JFrame("Test window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel text = new JLabel("Hey you fucker, best regards " + tmp, SwingConstants.CENTER);
        text.setPreferredSize(new Dimension(300, 300));
        frame.getContentPane().add(text, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        
        
        // ------- Making a button -----------
        JLabel input = new JLabel();
        input.setText("Write your name");  
        input.setBounds(10,10,100,100);
        JTextField textfield = new JTextField();
        textfield.setBounds(110,50,130,30);
        frame.add(input);
        frame.add(textfield);
        JButton button = new JButton("Submit");
        frame.add(button);
        button.setBounds(100,100,140,40);
        frame.setLayout(null);
        frame.pack();
        frame.setVisible(true);

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
               String in = textfield.getText();
               JDialog d = new JDialog(frame, in, true);
               d.setLocationRelativeTo(frame); 
            }


        });

    }

}


class Variables {
    int number = 1234;
    boolean done = true;
    static String name = "Kristian";

    public static int sum(int a, int b){
        int tmp = a + b;
        return tmp;
    }
}