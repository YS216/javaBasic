import java.io.Serializable;

public class BizCardData implements Serializable {
	
	private int no;
	private String name;
	private String company;
	private String position;
	private String eMail;
	private String phone;
	
	public BizCardData(int no, String name, String company, String position, String eMail, String phone) {
		// this();
		this.no = no;
		this.name = name;
		this.company = company;
		this.position = position;
		this.eMail = eMail;
		this.phone = phone;
	}
	
	/////////////
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
