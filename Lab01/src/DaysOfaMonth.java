import java.util.Scanner;

public class DaysOfaMonth {

    static String scanString() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    static int checkMonthChars(String month) {
        String[] monthName = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        String[] monthShortName = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        for(int i = 0; i < 12; i++) {
            if(month.equals(monthShortName[i]) || month.equals(monthName[i])) return i+1;
        }
        return 0;
    }

    static int monthValidation() {
        String monthInput;
        int check = 0;
        int month = 0;
        do {
            System.out.print("Nhập tháng: ");
            monthInput = scanString();
            if(checkMonthChars(monthInput.toUpperCase()) > 0) {
                month = checkMonthChars(monthInput.toUpperCase());
                check = 1;
            }
            if(monthInput.length() == 4 && monthInput.charAt(3) == '.') {
                month = checkMonthChars(monthInput.substring(0,3).toUpperCase());
                // System.out.print(monthInput.substring(0,3));
                if(month > 0)  {
                    check = 1;
                }
            }
            if(monthInput.length() == 3) {
                month = checkMonthChars(monthInput.toUpperCase());
                if(month > 0) {
                    check = 1;
                }
            }
            if(monthInput.length() == 2) {
                if(Character.isDigit(monthInput.charAt(0)) && Character.isDigit(monthInput.charAt(1))) {
                    month = Integer.parseInt(monthInput);
                    if(month > 0 && month < 13) check = 1;
                }
            }
            if(monthInput.length() == 1) {
                if(Character.isDigit(monthInput.charAt(0))) {
                    month = Integer.parseInt(monthInput);
                    if(month > 0 && month < 10) check = 1;
                }
            }
            if(check == 0) System.out.println("Nhập lại tháng !");
        } while(check == 0);
        return month;
    }

    static int answer(int month) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Nhập năm: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int leapYear = 0;
        if(year % 100 == 0 && year % 400 != 0) leapYear = 1;
        if(month == 2) return daysInMonth[1] + leapYear;
        else {
            return daysInMonth[month-1] + leapYear;
        }
    }

    public static void main(String[] args) {
        int ans = answer(monthValidation());
        System.out.println("Num of Days: "+ ans);
    }
}
