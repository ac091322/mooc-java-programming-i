/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alanchang
 */
public class PaymentCard {

    private double balance;
    private final double maxBalance = 150;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if (this.balance >= 2.6) {
            this.balance -= 2.6;
        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.6) {
            this.balance -= 4.6;
        }
    }

    public void addMoney(double deposit) {
        if (deposit < 0) {
            this.balance += 0;
        }

        if (deposit > 0 && this.balance <= 150) {
            this.balance += deposit;
        }

        if (this.balance > maxBalance) {
            this.balance = 150;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + balance + " euros";
        // cannot use the method below with any combination: %f, %.1f, or %.16f
        // return String.format("The card has a balance of %.16f euros", balance);
    }
}
