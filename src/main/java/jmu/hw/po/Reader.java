package jmu.hw.po;

import javax.validation.constraints.Pattern;

public class Reader {
	
	
	@Pattern(regexp="[0-9_-]{5,12}",
			 message="用户ID必须是5-12位数字")
    private String readerId;
 
    private String readerTypeId;
    
    private String unitId;
    
    private Unit unit;
    @Pattern(regexp="(^[\\u4E00-\\u9FA5]{2,8}$)|(^[a-zA-Z_-]{3,16})",
    		 message="用户名必须是2-8位中文或3-16位英文")
    private String userName;

    private String userPswd;

    private String userRole;

    private Byte readerSex;

    @Pattern(regexp="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$",
    		message="邮箱格式不正确")
    private String readerEmail;

    @Pattern(regexp="^1[34578]\\d{9}$",
    		message="手机号码格式不正确")
    private String readerPhone;

    private String readerState;
    
    private ReaderType readerType;

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId == null ? null : readerId.trim();
    }

    public String getReaderTypeId() {
        return readerTypeId;
    }

    public void setReaderTypeId(String readerTypeId) {
        this.readerTypeId = readerTypeId == null ? null : readerTypeId.trim();
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPswd() {
        return userPswd;
    }

    public void setUserPswd(String userPswd) {
        this.userPswd = userPswd == null ? null : userPswd.trim();
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    public Byte getReaderSex() {
        return readerSex;
    }

    public void setReaderSex(Byte readerSex) {
        this.readerSex = readerSex;
    }

    public String getReaderEmail() {
        return readerEmail;
    }

    public void setReaderEmail(String readerEmail) {
        this.readerEmail = readerEmail == null ? null : readerEmail.trim();
    }

    public String getReaderPhone() {
        return readerPhone;
    }

    public void setReaderPhone(String readerPhone) {
        this.readerPhone = readerPhone == null ? null : readerPhone.trim();
    }

    public String getReaderState() {
        return readerState;
    }

    public void setReaderState(String readerState) {
        this.readerState = readerState == null ? null : readerState.trim();
    }

	public ReaderType getReaderType() {
		return readerType;
	}

	public void setReaderType(ReaderType readerType) {
		this.readerType = readerType;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Reader [readerId=" + readerId + ", readerTypeId=" + readerTypeId + ", readerType=" + readerType
				+ ", unitId=" + unitId + ", unit=" + unit + ", userName=" + userName + ", userPswd=" + userPswd
				+ ", userRole=" + userRole + ", readerSex=" + readerSex + ", readerEmail=" + readerEmail
				+ ", readerPhone=" + readerPhone + ", readerState=" + readerState + "]";
	}

	public Reader(String readerId, String readerTypeId, String unitId,
			String userName, Byte readerSex, String readerEmail, String readerPhone,
			String readerState) {
		super();
		this.readerId = readerId;
		this.readerTypeId = readerTypeId;
		this.unitId = unitId;
		this.userName = userName;
		this.readerSex = readerSex;
		this.readerEmail = readerEmail;
		this.readerPhone = readerPhone;
		this.readerState = readerState;
	}

	public Reader() {
	}
    
}