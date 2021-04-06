package jmu.hw.po;

public class BorrowRequire extends BorrowRequireKey {
    private Short borrowPeriod;

    private Short bookNumber;

    private Short renewalDays;

    public Short getBorrowPeriod() {
        return borrowPeriod;
    }

    public void setBorrowPeriod(Short borrowPeriod) {
        this.borrowPeriod = borrowPeriod;
    }

    public Short getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(Short bookNumber) {
        this.bookNumber = bookNumber;
    }

    public Short getRenewalDays() {
        return renewalDays;
    }

    public void setRenewalDays(Short renewalDays) {
        this.renewalDays = renewalDays;
    }
}