package Controller;

import Common.Validate; 

public class Manager {
    public void run() {
        System.out.print("Phone number: ");
        Validate.checkInputPhone();
        System.out.print("Date: ");
        Validate.checkInputDate();
        System.out.print("Email: ");
        Validate.checkInputEmail();
    }
}
