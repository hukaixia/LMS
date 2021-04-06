package jmu.hw.po;

public class ReaderType {
    private String readerTypeId;

    private String readerTypeName;

    public String getReaderTypeId() {
        return readerTypeId;
    }

    public void setReaderTypeId(String readerTypeId) {
        this.readerTypeId = readerTypeId == null ? null : readerTypeId.trim();
    }

    public String getReaderTypeName() {
        return readerTypeName;
    }

    public void setReaderTypeName(String readerTypeName) {
        this.readerTypeName = readerTypeName == null ? null : readerTypeName.trim();
    }
}