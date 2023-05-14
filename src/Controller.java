public class Controller {

	private View view;

	private ReminderList reminderList;

	public void add(int i, String n, int p) {
		Reminder r1 = new Reminder();
		r1.setName(n);
		r1.setPriority(p);
		reminderList.add(i, r1);
	}

	public void setView(View view) {
		this.view = view;
	}

	public View getView() {
		return view;
	}

	public void setReminderList(ReminderList reminderList) {
		this.reminderList = reminderList;
	}

	public ReminderList getReminderList() {
		return reminderList;
	}

	public void remove() {

	}

	public void clear() {

	}

}
