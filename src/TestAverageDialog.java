import javax.swing.*;

public class TestAverageDialog {
    public static void main(String[] args){
        int score1, score2, score3;
        String strInput;
        double ave;
        int rep;

        do{
            strInput = JOptionPane.showInputDialog(null, "Enter Score #1: ");
            score1 = Integer.parseInt(strInput);
            strInput = JOptionPane.showInputDialog(null, "Enter Score #2: ");
            score2 = Integer.parseInt(strInput);
            strInput = JOptionPane.showInputDialog(null, "Enter Score #3: ");
            score3 = Integer.parseInt(strInput);
            ave = (score1 + score2 + score3) / 3.0;
            JOptionPane.showMessageDialog(null, "The average is " + ave);
            rep = JOptionPane.showConfirmDialog(null,
                    "Would you like to average another set of scores?", "Please Confirm.", JOptionPane.YES_NO_OPTION);
        }while (rep == JOptionPane.YES_OPTION);
        System.exit(0);
    }
}
