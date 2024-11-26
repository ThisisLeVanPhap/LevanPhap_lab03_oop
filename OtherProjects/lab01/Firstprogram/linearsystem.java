import javax.swing.JOptionPane;

public class linearsystem {
    public static void main(String[] args) {
        String strA1 = JOptionPane.showInputDialog(null, "Nhập a1:", JOptionPane.INFORMATION_MESSAGE);
        String strB1 = JOptionPane.showInputDialog(null, "Nhập b1:", JOptionPane.INFORMATION_MESSAGE);
        String strC1 = JOptionPane.showInputDialog(null, "Nhập c1:", JOptionPane.INFORMATION_MESSAGE);
        String strA2 = JOptionPane.showInputDialog(null, "Nhập a2:", JOptionPane.INFORMATION_MESSAGE);
        String strB2 = JOptionPane.showInputDialog(null, "Nhập b2:", JOptionPane.INFORMATION_MESSAGE);
        String strC2 = JOptionPane.showInputDialog(null, "Nhập c2:", JOptionPane.INFORMATION_MESSAGE);

        double a1 = Double.parseDouble(strA1);
        double b1 = Double.parseDouble(strB1);
        double c1 = Double.parseDouble(strC1);
        double a2 = Double.parseDouble(strA2);
        double b2 = Double.parseDouble(strB2);
        double c2 = Double.parseDouble(strC2);

        double det = a1 * b2 - a2 * b1;

        String result = "";

        if (det == 0) {
            if (c1 / c2 == a1 / a2) {
                result = "Vô số nghiệm";
            } else {
                result = "Vô nghiệm";
            }
        } else {
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;

            result = "Nghiệm của hệ phương trình là:\n";
            result += "x = " + x + "\n";
            result += "y = " + y;
        }

        JOptionPane.showMessageDialog(null, result, "Kết quả", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
