package mission;

public class Member {
	private String name;
	private String address;
	private String contactNumber;
	private String memberNumber;
	
	public Member(String name, String address, 
			String contactNumber,String memberNumber) {
			this.name=name;
			this.address=address;
			this.contactNumber=contactNumber;
			this.memberNumber=memberNumber;
		
	}
	public Member() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}
	
}
