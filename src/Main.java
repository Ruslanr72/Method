import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    //ЗАДАЧА 1
    public static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Year is leap!");
        } else {
            System.out.println(year + " Year is not leap!");
        }
    //ЗАДАЧА 2
    public static void Sys(int clientOs) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear >= 2015 && clientOs == 1) {
            System.out.println("Install version of app for Android by link"); //Стандартная установка для андроида
        } else if (currentYear >= 2015 && clientOs < 1) {
            System.out.println("Install version of app for iOS by link");//Стандартная версия iOS
        }

        if (currentYear < 2015 && clientOs == 1) {
            System.out.println("Install the light version of app for Android by link");//Облегченная Android
        } else if (currentYear < 2015 && clientOs < 1) {
            System.out.println("Install the light version of app for iOS by link");//Облегченная iOS
        }
    //ЗАДАЧА 3
    public static char delivery(char deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("It will take 1 day");
        } else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            System.out.println("It will take 2 days");
        } else if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            System.out.println("It will take 3 days");
        }
        return deliveryDistance;
    }

    //ЗАДАЧА 4
    public static void doubles(String str) {
        char[] carray = str.toCharArray();
        System.out.println("The string is:" + str);
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    //ЗАДАЧА 5
    public static void reverse(int massiv[]) {
        int vremennyMassiv[] = new int[massiv.length];
        for(int i=0;i<massiv.length;i++)
        {
            vremennyMassiv[massiv.length-1-i]=massiv[i];
        }
        massiv=vremennyMassiv;
        for (int i : massiv)
        {
            System.out.print(i);
        }
        }


    public static void main(String[] args) {
        isLeapYear(1960);
        Sys(1);
        delivery((char) 95);
        doubles("aabccddefgghiijjkk.");
        reverse(new int[]{3, 2, 1, 1, 4});
    }
}
