import javax.swing.JOptionPane;
public class fourtasks {
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "A: ", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "B: ", JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(strNum1);
        double b = Double.parseDouble(strNum2);

        System.out.println("Tong cua hai so la: " + (a + b));
        System.out.println("Hieu cua hai so la: " + (a - b));
        System.out.println("Tich cua hai so la: " + (a * b));
        System.out.printf("Thuong cua hai so la: %.2f%n", (a / b));
        System.exit(0);
    }    
}