import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> list = new ArrayList<Double>();
        List<String> strList = new ArrayList<String>();
        double result = 0;
        int option = 0;
        double amountToConvert = 0;
        String convertMore = "Y";

        // first screen
        System.out.println("Welcome to the currency convertor: \n");

        while (convertMore.equals("Y")) {

            // first screen
            System.out.println("Please choose the relevant option (1 / 2) \n1: dollars to shekels \n2: shekels to dollars\n");
            option = optionIsValidMethod();

            // second screen
            System.out.println("Please enter an amount to convert\n");

            amountToConvert = amountIsValidMethodIsValidMethod();

            if (option == 1) { // dollars to shekels
                ILS coin = new ILS();
                result = coin.calculate(amountToConvert);
                System.out.println(result); //third screen
                System.out.println("Do you want another conversion? Y/N");
                convertMore = ConvertMoreIsValidMethod();
                list.add(result);
            } else if (option == 2) { // shekels to dollars
                USD coin = new USD();
                result = coin.calculate(amountToConvert);
                System.out.println(result); //third screen
                System.out.println("Do you want another conversion? Y/N ");
                convertMore = ConvertMoreIsValidMethod();
                list.add(result);

            }
        } // options while


        // fourth screen
        System.out.println("Thanks for using our currency convertor\n Here are your conversions");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        try {
//            File myFile = new File("/Users/ifirst/Documents/Automation Course/FirstProject/result.txt");
//            for (int i = 0; i < list.size(); i++)
//                myFile.canWrite(List[i]);
//        } catch (Exception e) {
//            System.out.println("Error - " + e.toString());
//        }

    }

    public static int optionIsValidMethod() { // treat invalid options
        Scanner sc = new Scanner(System.in);
        boolean inputIsValid = false;
        int option = 0;

        while (!(inputIsValid)) {
            try {
                option = sc.nextInt();
                inputIsValid = true;
            } catch (Exception e) {
                inputIsValid = false;
            } finally {
                if (option == 1 || option == 2) {
                    inputIsValid = true;
                } else {
                    System.out.println("The input is not valid");
                    System.out.println("Please choose the relevant option (1 / 2) \n1: dollars to shekels \n2: shekels to dollars\n");
                    sc.next();
                }
            }
        }
        return option;
    }

    public static int amountIsValidMethodIsValidMethod() { // treat invalid options
        Scanner sc = new Scanner(System.in);
        boolean inputIsValid = false;
        int amount = 0;

        while (!(inputIsValid)) {
            try {
                amount = sc.nextInt();
                inputIsValid = true;
            } catch (Exception e) {
                inputIsValid = false;
            } finally {
                if(amount>0){
                    inputIsValid = true;
                }else{
                    System.out.println("The input is not valid");
                    System.out.println("Please enter an amount to convert");
                    sc.nextLine();
                }
            }


        }
        return amount;
    }

    public static String ConvertMoreIsValidMethod() { // treat invalid options
        Scanner sc = new Scanner(System.in);
        boolean inputIsValid = false;
        String convertMore = null;

        while (!(inputIsValid)) {
            try {
                convertMore = sc.next();
                inputIsValid = true;
            } catch (Exception e) {
                inputIsValid = false;
            } finally {
                if (convertMore.equals("Y") || convertMore.equals("N")) {
                    inputIsValid = true;
                } else {
                    inputIsValid = false;
                    System.out.println("The input is not valid");
                    System.out.println("Please choose if you want another conversion or not (Y / N) \nY: Yes \nN: No\n");
                    sc.nextLine();
                }
            }
        }
        return convertMore;
    }




} // main






