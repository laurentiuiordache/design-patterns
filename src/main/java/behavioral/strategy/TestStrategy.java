package behavioral.strategy;

import behavioral.strategy.beans.AmexStrategy;
import behavioral.strategy.beans.CreditCard;
import behavioral.strategy.beans.VisaStrategy;

import java.time.LocalDate;
import java.time.Month;

public class TestStrategy {
    public static void main(String[] args) {

        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("340000000000009");
        amexCard.setDate(LocalDate.of(1994, Month.AUGUST, 21));
        amexCard.setCvv("014");

        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("4111111111111111");
        visaCard.setDate(LocalDate.of(1993, 2, 12));
        visaCard.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard.isValid());
        System.out.println("Is Visa valid: " + visaCard.isValid());


    }
}
