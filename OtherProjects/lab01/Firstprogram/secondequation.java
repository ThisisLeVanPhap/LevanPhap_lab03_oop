import javax.swing.JOptionPane;

public class secondequation {
    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog(null, "Nhập hệ số a:", JOptionPane.INFORMATION_MESSAGE);
        String strB = JOptionPane.showInputDialog(null, "Nhập hệ số b:", JOptionPane.INFORMATION_MESSAGE);
        String strC = JOptionPane.showInputDialog(null, "Nhập hệ số c:", JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);

        double delta = b * b - 4 * a * c;

        String result = "";

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            result = "Hai nghiệm thực:\n";
            result += "x1 = " + x1 + "\n";
            result += "x2 = " + x2;
        } else if (delta == 0) {
            double x = -b / (2 * a);
            result = "Nghiệm kép:\n";
            result += "x = " + x;
        } else {
            double re = -b / (2 * a);
            double im = Math.sqrt(-delta) / (2 * a);
            result = "Có nghiệm phức:\n";
            result += "x1 = " + re + " + " + im + "i\n";
            result += "x2 = " + re + " - " + im + "i";
        }

        JOptionPane.showMessageDialog(null, result, "Kết quả", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
