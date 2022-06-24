import java.util.*;
import javax.swing.JOptionPane;

public class datasama {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Masukkan nilai array pertama(pisahkan dengan koma): ");
        String input2 = JOptionPane.showInputDialog("Masukkan nilai array kedua(pisahkan dengan koma): ");

        String[] array1 = input1.split(", ", 0);
        String[] array2 = input2.split(", ", 0);

        String match = "";

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    match += array1[i] + "\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Nilai array yang sama :\n" + (match));
    }
}
