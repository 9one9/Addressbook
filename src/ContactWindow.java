import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

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
//Instance components

    public ContactWindow(){

        final int window_WIDTH = 200;
        final int window_HEIGHT = 400;

        setTitle("(Testing) Add Contact");
        setSize(window_WIDTH,window_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();

        add(panel);

        pack();
        setVisible(true);
    }

    //Panes, then panels, then components: like text and buttons.
    private void buildPanel(){

        panel = new JPanel();  //Single panel for this window at the moment.

        label = new JLabel("First Name:");
        label2 = new JLabel("Last Name:");
        label3 = new JLabel("Phone Number:");
        label4 = new JLabel("Address:");

        text = new JTextField(10);
        text2 = new JTextField(10);
        text3 = new JTextField(10);
        text4 = new JTextField(10);

        button = new JButton("Add contact");
        button2 = new JButton("Return");
            //Action Listener below!

        button.addActionListener(new ContactAdder());

        //This panel describes an input window where contacts can be created.

        panel.add(label); //First Name
        panel.add(text);

        panel.add(label2); //Lastname
        panel.add(text2);

        panel.add(label3); //Phone Number
        panel.add(text3);

        panel.add(label4); //Address
        panel.add(text4);

        panel.add(button); //Add
        panel.add(button2); //Cancel & Return
    }

    public class ContactAdder implements ActionListener {

        String inputFN; //firstname
        long inputPhone;
        String tempNum;


        //Specifically for addcontact.
        public void actionPerformed(ActionEvent e){

            System.out.println("Contact Below");

           //  inputFN = label.setText(text.getText());  //Method contributes firstname

            inputFN = text.getText();
            System.out.println(inputFN);

            tempNum = text3.getText();
                //Accepting numbers requires accepting as STRING THEN converting to a NUMBER.

            //***********
                //Need to throw exception in case of TEXT in NUMBER field ^
            //**********

            inputPhone = Long.parseLong(tempNum);
            System.out.println(inputPhone);

            new Contact<>(inputFN,inputPhone);

        }

        public String getfname(){
            return inputFN;
        }

        public long getInputPhone(){
            return inputPhone;
        }
        //Create Getters for pipeline to Process.Java



    }

}
