import javax.swing.*;

public class Calculate {
    public static void main(String[] args) {
        String strnum1, strnum2;
        strnum1 = JOptionPane.showInputDialog(null,"Please input the first number: ",
                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double s1 = Double.parseDouble(strnum1);
        strnum2 = JOptionPane.showInputDialog(null,"Please input the second number: ",
                "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double s2 = Double.parseDouble(strnum2);
        double sum = s1 + s2;
        double diff = s1 - s2;
        double prd = s1 * s2;
        double quo = s1 / s2;
        String display = "Sum = " + sum + "\n" + "Difference = " + diff + "\n" + "Product = " + prd + "\n" + "Quotient = " + quo;
        JOptionPane.showMessageDialog(null, display, "Show 2 numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
