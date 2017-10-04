import javax.swing.*;
import java.awt.*;

/**
 * Created by Rayson on 10/3/17.
 */

public class ContactWindow extends JFrame{

    private JPanel panel;
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;

    private JTextField text;
    private JTextField text2;
    private JTextField text3;
    private JTextField text4;


    private JButton button;
    private JButton button2;


    public ContactWindow(){

        final int window_WIDTH = 400;
        final int window_HEIGHT = 700;


        setTitle("(Testing) Contacts");
        setSize(window_WIDTH,window_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        pack();
        setVisible(true);
        setLayout(new GridLayout(4,2));

    }

    //Panes, then panels, then components, like text and buttons.
    private void buildPanel(){
        label = new JLabel("First Name:");
        label2 = new JLabel("Last Name:");
        label3 = new JLabel("Phone Number:");
        label4 = new JLabel("Address:");

        text = new JTextField(10);
        text2 = new JTextField(10);
        text3 = new JTextField(10);
        text4 = new JTextField(10);

        button = new JButton("Go");
        button2 = new JButton("Return");

        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();

        /**
         panel.add(label);
         panel.add(label2);
         panel.add(label3);
         panel.add(label4);

         //This panel describes an input window where contacts can be created.
         **/

        panel.add(text, BorderLayout.CENTER);
        panel.add(text2, BorderLayout.CENTER);
        panel.add(text3);
        panel.add(text4);

        panel.add(button);
        panel.add(button2);




    }

}
