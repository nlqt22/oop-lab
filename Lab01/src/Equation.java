import javax.swing.*;

public class Equation {
    static double scanDouble(String message, String title) {
        String num = JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
        return Double.parseDouble(num);
    }

    // ax + b = 0
    static void firstDegreeEquationOneVar() {
        String title = "The first-degree with one variable";
        double a;
        do {
            a = scanDouble("a = ", title);
            if(a == 0) JOptionPane.showMessageDialog(null, "Nhập a khác 0");
        } while (a == 0);
        double b = scanDouble("b = ", title);
        double x = (-b)/a;
        String display = "x = " + x;
        JOptionPane.showMessageDialog(null, display, title, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    static void firstDegreeEquationTwoVars() {
        String title = "The first-degree equations with 2 variables";
        double a11 = scanDouble("a11 = ", title);
        double a12 = scanDouble("a12 = ", title);
        double b1 = scanDouble("b1 = ", title);
        double a21 = scanDouble("a21 = ", title);
        double a22 = scanDouble("a22 = ", title);
        double b2 = scanDouble("b2 = ", title);

        double D = a11*a22 - a21*a12;
        double D1 = b1*a22 - b2*a12;
        double D2 = a11*b2 - a21*b1;
        double x1 = D/D1;
        double x2 = D/D2;

        if(D == 0 && D1 != 0 || D2 != 0) {
            JOptionPane.showMessageDialog(null, "Vo nghiem", title, JOptionPane.INFORMATION_MESSAGE);
            return ;
        }

        if(D == D1 && D == D2 && D == 0) {
            JOptionPane.showMessageDialog(null, "Vo so nghiem", title, JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
        if(D != 0) {
            String display = "x1 = " + x1 + " and " + "x2 = " + x2;
            JOptionPane.showMessageDialog(null, display, title, JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        return ;
    }

    static void menu() {
        int op;
        do {
            String num_op = JOptionPane.showInputDialog(null, "1: 1-degree equation with 1 var\n2: 1-degree equations with 2 vars\n0: Exit", "Menu", JOptionPane.INFORMATION_MESSAGE);
            op = Integer.parseInt(num_op);
            if(op == 1) firstDegreeEquationOneVar();
            if(op == 2) firstDegreeEquationTwoVars();
            if(op == 0) break;
            if(op > 2 || op < 0) JOptionPane.showMessageDialog(null, "Error !");
        } while(op == 0);
    }

    public static void main(String[] args) {
        menu();
    }
}
