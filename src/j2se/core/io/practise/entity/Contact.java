package j2se.core.io.practise.entity;

public class Contact {

	private int id;
	private String realName;
	private String mobile;
	private Group group;

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Contact(int id, String realName, String mobile, Group group) {
		super();
		this.id = id;
		this.realName = realName;
		this.mobile = mobile;
		this.group = group;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", realName=" + realName + ", mobile="
				+ mobile + ", group=" + group + "]";
	}
}
