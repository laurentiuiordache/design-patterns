package behavioral.strategy.beans;

import java.time.LocalDate;

public class CreditCard {
    private String number;
    private LocalDate date;
    private String cvv;
    private ValidationStrategy strategy;

    public CreditCard(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isValid(){
        return strategy.isValid(this);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
