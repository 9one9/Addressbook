import javax.swing.*;
import java.awt.*;

/**
 * Created by Rayson on 10/3/17.
 */

public class ContactWindow extends JFrame{

    private JPanel panel;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;





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

        final int window_WIDTH = 200;
        final int window_HEIGHT = 400;


        setTitle("(Testing) Contacts");
        setSize(window_WIDTH,window_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();

        add(panel);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);


        pack();
        setVisible(true);
        setLayout(new GridLayout(5,2,0,1));

    }

    //Panes, then panels, then components, like text and buttons.
    private void buildPanel(){

        panel = new JPanel();
        panel2 = new JPanel();
        panel3= new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();


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




         panel.add(label);
         panel2.add(label2);
         panel3.add(label3);
         panel4.add(label4);

         //This panel describes an input window where contacts can be created.


        panel.add(text);
        panel2.add(text2);
        panel3.add(text3);
        panel4.add(text4);

        panel5.add(button);
        panel5.add(button2);




    }

}
