package j2se.core.io.practise.entity;

public class Group {
	private int id;

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + "]";
	}

	public Group(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}
}
