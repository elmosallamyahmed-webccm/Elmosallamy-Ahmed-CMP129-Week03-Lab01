import java.util.Scanner;
public class Date {
    Scanner input = new Scanner(System.in);
    int day;
    int month;
    int year;
    final String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public void getDate(){
        System.out.println("What is the day in '00' formatting?");
        this.day = input.nextInt();
        while( day < 1 || day >31){
            System.out.println("Please ensure it is an integer greater than 0 and less than 31");
            System.out.println("What is the day in '00' formatting?");
            this.day = input.nextInt();
        } 
        System.out.println("What is the month in '00' formatting?");
        this.month = input.nextInt();
        while( month < 1 || month >12){
            System.out.println("Please ensure it is an integer greater than 0 and less than 13");
            System.out.println("What is the month in '00' formatting?");
            this.month = input.nextInt();
        }
        System.out.println("What is the year in '0000' formatting?");
        this.year = input.nextInt();
    }
    public void format1(){
        System.out.printf("%d / %d / %d%n", month, day, year);
    }
    public void format2(){
        System.out.printf("%s %d, %d%n", months[month-1], day, year);
    }
    public void format3(){
        System.out.printf("%d %s %d%n", day, months[month-1], year);
    }
}
