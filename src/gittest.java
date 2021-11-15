import javax.swing.*;

public class gittest {
    public static void main(String[] args) {
        String nr;
        String ut = null;
        nr = JOptionPane.showInputDialog("Hur många tal?:");
        int nr1 = Integer.parseInt(nr);
        int i = 0;
        int o = 0;

                while(nr1 > i) {
                    ut = JOptionPane.showInputDialog("Välj ett heltal:");
                    int ut1 = Integer.parseInt(ut);
                    o += ut1;
                    i++;
                }
                int ut2 = o;
                ut2 = ut2/nr1;
                System.out.println(ut2);
    }
}
