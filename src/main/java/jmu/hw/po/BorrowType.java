package jmu.hw.po;

import java.math.BigDecimal;

public class BorrowType {
    private String borrowTypeId;

    private String borrowTypeName;

    private BigDecimal fineUnivalence;

    public String getBorrowTypeId() {
        return borrowTypeId;
    }

    public void setBorrowTypeId(String borrowTypeId) {
        this.borrowTypeId = borrowTypeId == null ? null : borrowTypeId.trim();
    }

    public String getBorrowTypeName() {
        return borrowTypeName;
    }

    public void setBorrowTypeName(String borrowTypeName) {
        this.borrowTypeName = borrowTypeName == null ? null : borrowTypeName.trim();
    }

    public BigDecimal getFineUnivalence() {
        return fineUnivalence;
    }

    public void setFineUnivalence(BigDecimal fineUnivalence) {
        this.fineUnivalence = fineUnivalence;
    }
}