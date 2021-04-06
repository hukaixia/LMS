package jmu.hw.po;

public class Book {
    private Integer bookId;

    private String bookCallno;

    private String bookState;

    private Integer bookDamage;

    private BookDesc bookDesc;
    
    public BookDesc getBookDesc() {
		return bookDesc;
	}

	public void setBookDesc(BookDesc bookDesc) {
		this.bookDesc = bookDesc;
	}

	public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookCallno() {
        return bookCallno;
    }

    public void setBookCallno(String bookCallno) {
        this.bookCallno = bookCallno == null ? null : bookCallno.trim();
    }

    public String getBookState() {
        return bookState;
    }

    public void setBookState(String bookState) {
        this.bookState = bookState == null ? null : bookState.trim();
    }

    public Integer getBookDamage() {
        return bookDamage;
    }

    public void setBookDamage(Integer bookDamage) {
        this.bookDamage = bookDamage;
    }
}