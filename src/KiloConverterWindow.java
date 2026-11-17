import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KiloConverterWindow extends JFrame{
    private JPanel panel; //panel container
    private JLabel messageLabel; //display message
    private JTextField kiloTextField; //user input area
    private JButton calcButton; //button to start calculation
    private final int WINDOW_WIDTH = 320, WINDOW_HEIGHT = 100; //set width and height for window

    public KiloConverterWindow(){
        super("Kilometer Converter"); //JFrame constructor from superclass
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); //set size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //specify result of the close button being clicked
        buildPanel(); //function below class that builds the panel with components to be added
        add(panel); //adds panel to the window
        setVisible(true); //displays the window
    }

    private void buildPanel(){ //adds components to the panel to prepare to be added to the window
        messageLabel = new JLabel("Enter a distance in kilometers: ");
        kiloTextField = new JTextField(10);
        calcButton = new JButton("Calculate");
        calcButton.addActionListener(new CalcButtonListener()); //adds eventlsitener specified in respective class
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);
    }
    //Mennua Netri Herta Davis
    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String str; //holds user input
            double miles; //holds the converted kilo to miles

            str = kiloTextField.getText(); //gets user input and adds it to str
            System.out.println("Reading " + str + " from the text field."); //debugging purposes
            System.out.println("Converted value: " + Double.parseDouble(str)); //debugging purposes
            miles = Double.parseDouble(str) * 0.6214; //does conversion
            JOptionPane.showMessageDialog(null, str + " kilometers is " + miles + " miles.");
            System.out.println("Ready for the next input."); //debugging purposes
        }
    }

    public static void main(String[] args){
        new KiloConverterWindow();
        //creates instance of KiloConverterWindow class, also creating the window due to constructor contents
    }
}


