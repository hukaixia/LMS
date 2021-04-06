package jmu.hw.po;

public class Writer {
    private Integer writerId;

    private String writerName;

    public Integer getWriterId() {
        return writerId;
    }

    public void setWriterId(Integer writerId) {
        this.writerId = writerId;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName == null ? null : writerName.trim();
    }

	@Override
	public String toString() {
		return "Writer [writerId=" + writerId + ", writerName=" + writerName + "]";
	}
    
}