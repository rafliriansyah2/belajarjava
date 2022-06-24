import javax.swing.JOptionPane;

public class datasamaInt {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Masukkan nilai array pertama(pisahkan dengan koma): ");

        String input2 = JOptionPane.showInputDialog("Masukkan nilai array kedua(pisahkan dengan koma): ");

        String[] input1_array = input1.split(",");
        int[] input1_int_array = new int[input1_array.length];
        for (int i = 0; i < input1_array.length; i++) {
            input1_int_array[i] = Integer.parseInt(input1_array[i]);
        }

        String[] input2_array = input2.split(",");
        int[] input2_int_array = new int[input2_array.length];
        for (int i = 0; i < input2_array.length; i++) {
            input2_int_array[i] = Integer.parseInt(input2_array[i]);
        }

        String match = "";

        for (int i = 0; i < input1_int_array.length; i++) {
            for (int j = 0; j < input2_int_array.length; j++) {
                if (input1_int_array[i] == input2_int_array[j]) {
                    match += input1_int_array[i] + "\n";
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Nilai yang sama adalah: \n" + match);

    }
}
