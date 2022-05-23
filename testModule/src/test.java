import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);
        String day = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        int price = 0;
        boolean isNotValid = true;
        if (age >= 0 && age <= 18){

            if (day.equals("Weekday")){
                price = 12;
            } else if (day.equals("Weekend")){
                price = 15;
            } else if (day.equals("Holiday")){
                price = 5;
            }

        } else if (age > 18 && age <= 64){
            if (day.equals("Weekday")){
                price = 18;
            } else if (day.equals("Weekend")){
                price = 20;
            } else if (day.equals("Holiday")){
                price = 12;
            }

        } else if (age > 64 && age <= 122){
            if (day.equals("Weekday")){
                price = 12;
            } else if (day.equals("Weekend")){
                price = 15;
            } else if (day.equals("Holiday")){
                price = 10;
            }

        }
        if (isNotValid) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", price);
        }
    }
}
