public class Reminder {
	//保持するデータ
	private String name;
	private int priority;

	//コンストラクタ
	public Reminder(String n, int i) {
		this.name = n;
		this.priority = i;
	}
	
	public Reminder() {
	}
	
	//メソッド
	public String show() {
		System.out.printf("%s(%d)\n", this.name, this.priority);
		return null;
	}
	
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

}