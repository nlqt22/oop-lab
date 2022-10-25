import javax.swing.*;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strnum1, strnum2;
        String strNtf = "You've just entered: ";
        strnum1 = JOptionPane.showInputDialog(null,"Please input the first number: ",
                                            "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNtf += strnum1 + " and ";
        strnum2 = JOptionPane.showInputDialog(null,"Please input the second number: ",
                                            "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNtf += strnum2;
        JOptionPane.showMessageDialog(null, strNtf, "Show 2 numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
