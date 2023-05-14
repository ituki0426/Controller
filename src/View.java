import java.awt.*;
import java.awt.event.*;

public class View extends Frame implements ActionListener {

	private Controller controller;

	private ReminderList reminderList;
	private Frame f1, f2;
	private TextField index, name, priority;
	private List l1;

	public View() {
		super("View");
		Button add_1 = new Button("add");
		add_1.addActionListener(this);
		f1 = new Frame("Reminder List");
		f2 = new Frame("Add Reminder");
		index = new TextField(10);
		name = new TextField(30);
		priority = new TextField(5);
		f2.setLayout(new FlowLayout());
		f2.add(index);
		f2.add(name);
		f2.add(priority);
		f2.add(add_1);
		l1 = new List();
		f1.add(l1);
		f1.setSize(300, 300);
		f2.pack();
		f2.setVisible(true);
		f1.setVisible(true);
	}

	class MyAListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Button: "
					+ e.getActionCommand());
			System.out.println("exit.");
			System.exit(0);
		}
	}

	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public Controller getController() {
		return controller;
	}

	public void setReminderList(ReminderList reminderList) {
		this.reminderList = reminderList;
	}

	public ReminderList getReminderList() {
		return reminderList;
	}

	public void update() {
		l1.removeAll();
		Reminder[] l = reminderList.getReminder();
		for (int i = 0; i < l.length; i++) {
			String str = "";
			str += "[" + String.valueOf(i) + "] ";
			if (l[i] != null) {
				str += l[i].getName();
				str += "(" + l[i].getPriority() + ")";
			}
			l1.add(str);
		}
	}

}
