package jmu.hw.po;



public class BorrowKey {
    private Integer bookId;

    private String readerId;

    private String borrowDate;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId == null ? null : readerId.trim();
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }
    
	public BorrowKey(Integer bookId, String readerId, String borrowDate) {
		super();
		this.bookId = bookId;
		this.readerId = readerId;
		this.borrowDate = borrowDate;
	}

	public BorrowKey() {
		super();
	}
}