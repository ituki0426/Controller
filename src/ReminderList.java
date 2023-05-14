public class ReminderList {

	private Reminder[] reminder;
	private View view;

	public ReminderList() {
		reminder = new Reminder[10];
	}

	public void show() {
		System.out.println("---ReminderList---");
		for (int i = 0; i < reminder.length; i++) {
			if (reminder[i] != null) {
				System.out.print(i + ": ");
				reminder[i].show();
			}
		}
		System.out.println("---End of List---");
		System.out.println();
	}

	public void setView(View view) {
		this.view = view;
	}

	public View getView() {
		return view;
	}

	public void add(int i, Reminder r) {
		reminder[i] = r;
		view.update();
	}

	public void setRmind(int i, Reminder r) {
		reminder[i] = r;
	}

	public Reminder[] getReminder() {
		return reminder;
	}

	public void remove(int i) {
		reminder[i] = null;
		view.update();
	}

	public void clear() {
		reminder = new Reminder[10];
		view.update();
	}

}
