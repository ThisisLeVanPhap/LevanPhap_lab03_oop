import java.util.Scanner;

public class day {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Year: ");
        int year = sc.nextInt();

        System.out.print("Month: ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Error");
        } else {
            int res = calculate(year, month);
            System.out.println( "Thang " + month + " nam " + year + " co " + res + " ngay");
        }
    }

    public static int calculate(int year, int month) {
        int days = 0;
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;                    
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;

            }
        }
        return days;
    }
}
