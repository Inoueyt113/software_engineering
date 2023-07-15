public class Controller {

	private View view;
	
	private ReminderList reminderList;

	//課題4-1　コントローラーからModelの変更を行う
	public void add(int i, String n, int p) {
		Reminder r1 = new Reminder();
		r1.setName(n);
		r1.setPriority(p);
		//
		reminderList.add(i, r1);
	}
	
	public void remove(int i) {
		reminderList.remove(i);
	}
	

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}

	public ReminderList getReminderList() {
		return reminderList;
	}

	public void setReminderList(ReminderList reminderList) {
		this.reminderList = reminderList;
	}
}
