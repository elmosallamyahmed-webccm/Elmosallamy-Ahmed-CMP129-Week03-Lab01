import java.util.Scanner;
public class Date {
    Scanner input = new Scanner(System.in);
    int day;
    int month;
    int year;
    public int getDate(int day, int month, int year){
        System.out.println("What is the day in '00' formatting?");
        this.day = input.nextInt();
        while( day < 1 || day >31){
            System.out.println("Please ensure it is an integer greater than 0 and less than 31");
            System.out.println("What is the day in '00' formatting?");
            this.day = input.nextInt();
        }
        System.out.println("What is the month in '00' formatting?");
        this.month = input.nextInt();
        while( month < 1 || month >31){
            System.out.println("Please ensure it is an integer greater than 0 and less than 13");
            System.out.println("What is the month in '00' formatting?");
            this.month = input.nextInt();
        }
    }
}
