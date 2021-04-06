package jmu.hw.po;

import java.math.BigDecimal;

public class FineDetail extends FineDetailKey {
    private String fineReason;

    private BigDecimal fineUnivalence;

    public String getFineReason() {
        return fineReason;
    }

    public void setFineReason(String fineReason) {
        this.fineReason = fineReason == null ? null : fineReason.trim();
    }

    public BigDecimal getFineUnivalence() {
        return fineUnivalence;
    }

    public void setFineUnivalence(BigDecimal fineUnivalence) {
        this.fineUnivalence = fineUnivalence;
    }

	@Override
	public String toString() {
		return "FineDetail [fineReason=" + fineReason + ", fineUnivalence=" + fineUnivalence + "]";
	}
    
    
}