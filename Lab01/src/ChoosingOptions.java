import javax.swing.*;

public class ChoosingOptions {
    public static void main(String[] args) {
        Object[] options = {"I do", "I don't"};
        int option = JOptionPane.showOptionDialog(null, "Do you want to change the first class ticket?", "Option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
