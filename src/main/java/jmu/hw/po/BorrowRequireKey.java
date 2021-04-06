package jmu.hw.po;

public class BorrowRequireKey {
    private String borrowTypeId;

    private String readerTypeId;

    public String getBorrowTypeId() {
        return borrowTypeId;
    }

    public void setBorrowTypeId(String borrowTypeId) {
        this.borrowTypeId = borrowTypeId == null ? null : borrowTypeId.trim();
    }

    public String getReaderTypeId() {
        return readerTypeId;
    }

    public void setReaderTypeId(String readerTypeId) {
        this.readerTypeId = readerTypeId == null ? null : readerTypeId.trim();
    }

	public BorrowRequireKey(String borrowTypeId, String readerTypeId) {
		super();
		this.borrowTypeId = borrowTypeId;
		this.readerTypeId = readerTypeId;
	}

	public BorrowRequireKey() {
	
	}
    
    
}