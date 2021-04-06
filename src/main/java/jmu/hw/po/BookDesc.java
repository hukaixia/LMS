package jmu.hw.po;

import java.math.BigDecimal;
import java.util.Date;


public class BookDesc{
    private String bookCallno;

    private String pressId;

    private String borrowTypeId;

    private String clcId;

    private String branchId;

    private String isbn;

    private String bookName;

    private BigDecimal bookPrice;

    private Integer wordNumber;

    private String bookIntro;

    private String publishDate;

    private String collectionDate;

    private Short collectionNumber;

    private Short avaliableLoan;

    private String bookImage;
    
    private Press press;   
    
    private Branch branch;
    
    private BorrowType borrowType;
    
    private Clc clc;

    public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Clc getClc() {
		return clc;
	}

	public void setClc(Clc clc) {
		this.clc = clc;
	}

	public String getBookCallno() {
        return bookCallno;
    }

    public BorrowType getBorrowType() {
		return borrowType;
	}

	public void setBorrowType(BorrowType borrowType) {
		this.borrowType = borrowType;
	}

	public void setBookCallno(String bookCallno) {
        this.bookCallno = bookCallno == null ? null : bookCallno.trim();
    }

    public String getPressId() {
        return pressId;
    }

    public void setPressId(String pressId) {
        this.pressId = pressId == null ? null : pressId.trim();
    }

    public String getBorrowTypeId() {
        return borrowTypeId;
    }

    public void setBorrowTypeId(String borrowTypeId) {
        this.borrowTypeId = borrowTypeId == null ? null : borrowTypeId.trim();
    }

    public String getClcId() {
        return clcId;
    }

    public void setClcId(String clcId) {
        this.clcId = clcId == null ? null : clcId.trim();
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId == null ? null : branchId.trim();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getWordNumber() {
        return wordNumber;
    }

    public void setWordNumber(Integer wordNumber) {
        this.wordNumber = wordNumber;
    }

    public String getBookIntro() {
        return bookIntro;
    }

    public void setBookIntro(String bookIntro) {
        this.bookIntro = bookIntro == null ? null : bookIntro.trim();
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(String collectionDate) {
        this.collectionDate = collectionDate;
    }

    public Short getCollectionNumber() {
        return collectionNumber;
    }

    public void setCollectionNumber(Short collectionNumber) {
        this.collectionNumber = collectionNumber;
    }

    public Short getAvaliableLoan() {
        return avaliableLoan;
    }

    public void setAvaliableLoan(Short avaliableLoan) {
        this.avaliableLoan = avaliableLoan;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage == null ? null : bookImage.trim();
    }
    
	public Press getPress() {
		return press;
	}

	public void setPress(Press press) {
		this.press = press;
	}

	public BookDesc(String bookCallno, String pressId, String borrowTypeId, String clcId, String branchId, String isbn,
			String bookName, BigDecimal bookPrice, Integer wordNumber, String bookIntro, String publishDate,
			String collectionDate, Short collectionNumber, Short avaliableLoan, String bookImage) {
		super();
		this.bookCallno = bookCallno;
		this.pressId = pressId;
		this.borrowTypeId = borrowTypeId;
		this.clcId = clcId;
		this.branchId = branchId;
		this.isbn = isbn;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.wordNumber = wordNumber;
		this.bookIntro = bookIntro;
		this.publishDate = publishDate;
		this.collectionDate = collectionDate;
		this.collectionNumber = collectionNumber;
		this.avaliableLoan = avaliableLoan;
		this.bookImage = bookImage;
	}

	public BookDesc() {
		super();
	}


	@Override
	public String toString() {
		return "BookDesc [bookCallno=" + bookCallno + ", pressId=" + pressId + ", borrowTypeId=" + borrowTypeId
				+ ", clcId=" + clcId + ", branchId=" + branchId + ", isbn=" + isbn + ", bookName=" + bookName
				+ ", bookPrice=" + bookPrice + ", wordNumber=" + wordNumber + ", bookIntro=" + bookIntro
				+ ", publishDate=" + publishDate + ", collectionDate=" + collectionDate + ", collectionNumber="
				+ collectionNumber + ", avaliableLoan=" + avaliableLoan + ", bookImage=" + bookImage + ", press="
				+ press + "]";
	}

	
    
}