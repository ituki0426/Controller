public class Reminder {

	private String name;

	private int priority;

	public Reminder() {
		this.name = "no name";
		this.priority = 0;
	}

	public void show() {
		System.out.println(this.name + "(" + this.priority + ")");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getName() {
		return this.name;
	}

	public int getPriority() {
		return this.priority;
	}
}
