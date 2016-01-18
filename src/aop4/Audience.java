package aop4;

import aop.Performer;

public class Audience {
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }

    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones.");
    }

    public void applaud(Performer performer) {
        System.out.println("Bravo Mr. " + performer.getName() + "!");
    }

    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }
}
