import javax.swing.*;

public class gittest {
    public static void main(String[] args) {
        String nr;
        nr = JOptionPane.showInputDialog("Hur många tal?:");
        String ut;
        int nr1 = Integer.parseInt(nr);
        int i = 0;
        int o = 0;
        int bi = 0;
        int sm = 2147483647;

                while(nr1 > i) {
                    ut = JOptionPane.showInputDialog("Välj ett heltal:");
                    int ut1 = Integer.parseInt(ut);
                    if(ut1 > bi) {
                        bi = ut1;
                    }
                    if(ut1 < sm) {
                        sm = ut1;
                    }
                    o += ut1;
                    i++;
                }
                int ut2 = o;
                ut2 = ut2/nr1;
                System.out.println("Medelvärde: " + ut2 + "\nStörsta tal: " + bi + "\nMinsta tal: " + sm);

                String tx;
                tx = JOptionPane.showInputDialog("Skriv någonting:");
    }
}
