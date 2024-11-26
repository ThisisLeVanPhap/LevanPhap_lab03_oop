import javax.swing.JOptionPane;

public class linearequation {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog(null, "A: ", JOptionPane.INFORMATION_MESSAGE);
        String strNum2 = JOptionPane.showInputDialog(null, "B: ", JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(strNum1);
        double b = Double.parseDouble(strNum2);

        String result = "";

        if (a == 0) {
            if (b == 0) {
                result = "Vô số nghiệm.";
            } else {
                result = "Vô nghiệm.";
            }
        } else {
            double x = -b / a;
            result = "Kết quả: x = " + x;
        }

        JOptionPane.showMessageDialog(null, result,"Kết quả", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
