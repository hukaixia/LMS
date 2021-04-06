package jmu.hw.po;

import java.util.Date;

public class Borrow extends BorrowKey {
    private String returnDate;

    private  Short borrowState;

    private Short renewState;

    private String returnReadate;

    private Reader reader;
    
    private Book book;
    
    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public Short getBorrowState() {
        return borrowState;
    }

    public void setBorrowState(Short borrowState) {
        this.borrowState = borrowState;
    }

    public Short getRenewState() {
        return renewState;
    }

    public void setRenewState(Short renewState) {
        this.renewState = renewState;
    }

    public String getReturnReadate() {
        return returnReadate;
    }

    public void setReturnReadate(String returnReadate) {
        this.returnReadate = returnReadate;
    }

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	public Borrow(Integer bookId, String readerId, String borrowDate, String returnDate,
			Short renewState) {
		super(bookId, readerId, borrowDate);
		this.returnDate = returnDate;
		this.renewState = renewState;
	}

	public Borrow(Integer bookId, String readerId, String borrowDate) {
		super(bookId, readerId, borrowDate);
	}
	public Borrow(){
		
	}
}