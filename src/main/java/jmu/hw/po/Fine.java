package jmu.hw.po;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Fine {
    private Integer fineId;

    private String readerId;

    private String adminId;

    private Integer bookId;

    private String fineTime;

    private BigDecimal fineTotal;
    
    private Book book;
    
    private Reader reader;
    
    private List<FineDetail> fineDetail;

    public Integer getFineId() {
        return fineId;
    }

    public void setFineId(Integer fineId) {
        this.fineId = fineId;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId == null ? null : readerId.trim();
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getFineTime() {
        return fineTime;
    }

    public void setFineTime(String fineTime) {
        this.fineTime = fineTime;
    }

    public BigDecimal getFineTotal() {
        return fineTotal;
    }

    public void setFineTotal(BigDecimal fineTotal) {
        this.fineTotal = fineTotal;
    }

	@Override
	public String toString() {
		return "Fine [fineId=" + fineId + ", readerId=" + readerId + ", adminId=" + adminId + ", bookId=" + bookId
				+ ", fineTime=" + fineTime + ", fineTotal=" + fineTotal + ", book=" + book + ", reader=" + reader
				+ ", fineDetail=" + fineDetail + "]";
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public List<FineDetail> getFineDetail() {
		return fineDetail;
	}

	public void setFineDetail(List<FineDetail> fineDetail) {
		this.fineDetail = fineDetail;
	}
    
}