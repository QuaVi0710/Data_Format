/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author QuaVi
 */
public class Validate {
     private static final Scanner in = new Scanner(System.in);
    public static String checkInputString() {
               while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    public static String checkInputPhone() {
        while (true) {
            try {               
                 String phoneCheck = checkInputString();
                if (!phoneCheck.matches(Model.Phone_Email.PHONE_VALID)) {
                    System.err.println("Phone number must be 10 digits");
                } else {
                    return phoneCheck;
                }
            } catch (NumberFormatException ex) {
                System.out.print("Phone number: ");
                System.err.println("Phone number must be number");
            }
        }
    }


    public static String checkInputDate() {
        while (true) {
            try {
                String dateCheck = checkInputString();
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateCheck);
                return dateCheck;
            } catch (ParseException ex) {
                System.out.print("Date: ");
                System.err.println("Date to correct format(dd/MM/yyyy)");
            }
        }
    }

    public static String checkInputEmail() {
        while (true) {
            String emailCheck = checkInputString();
            if (!emailCheck.matches(Model.Phone_Email.EMAIL_VALID)) {
                System.err.println("Email must be correct format");
                System.out.print("Email: ");
            } else {
                return emailCheck;
            }
        }
    }
}
