package jmu.hw.po;

public class EditorKey {
    private Integer writerId;

    private String bookCallno;

    public Integer getWriterId() {
        return writerId;
    }

    public void setWriterId(Integer writerId) {
        this.writerId = writerId;
    }

    public String getBookCallno() {
        return bookCallno;
    }

    public void setBookCallno(String bookCallno) {
        this.bookCallno = bookCallno == null ? null : bookCallno.trim();
    }

	@Override
	public String toString() {
		return "EditorKey [writerId=" + writerId + ", bookCallno=" + bookCallno + "]";
	}
    
}