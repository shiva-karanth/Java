package Task;

class Project {
	private int id;
	private String name;

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

	public void displayDetails() {
		System.out.println(id);
		System.out.println(name);
	}
}

class Check {
	private int id;
	private String name;

	static Project p;

	public static void create(int id, String name) {
		if (p == null) {
			p = new Project();
			p.setId(id);
			p.setName(name);
		}
	}

	public static void read() {
		if (p != null) {
			System.out.println(p.getId());
			System.out.println(p.getName());
		} else
			System.out.println("No project");
	}

	public static void update(int id, String name) {
		if (p != null) {
			p.setId(id);
			p.setName(name);
			System.out.println();
			System.out.println("updated");
		}
	}

	public static void delete() {
		if (p != null) {
			p = null;
		}
	}

	public static void displayStudent() {
		System.out.println(p.getId());
		System.out.println(p.getName());
	}
}

public class task4b {

	public static void main(String[] args) {
		Check.create(10, "student 1");
		// Check.displayStudent();
		Check.read();
		Check.update(20, "new Student");
		Check.read();
		Check.delete();
	}

}