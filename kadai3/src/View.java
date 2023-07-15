import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View implements ActionListener {
	//保持するデータ
	private ReminderList reminderList;
	private Controller controller;
	
	private Frame f1;
	private List l1;
	
	//コンストラクタ
	public View() {
		f1 = new Frame();
		l1 = new List(10);
		f1.add(l1, BorderLayout.CENTER);
		f1.setSize(500, 300);
		f1.setVisible(true);
	}
	
	//メソッド
	public void updata() {
		l1.removeAll();
		//リストの内容を全て消す
		Reminder[] l = reminderList.getReminder(); 
		//リマインダの配列を取得する
		for(int i=0; i<l.length; i++) { 
			//取得した配列に繰り返し処理をする
			String str = "";
			//リマインダの情報から文字列を作る
			str += "[" + String.valueOf(i) + "] "; 
			//配列の添字を追加
			if(l[i]!=null) {
				str += l[i].getName(); 
				//リマインダの名前を取得して追加
				str += "(" + l[i].getPriority() + ") ";
				//リマインダの優先度を取得して追加
		}
			
		l1.add(str);
		//リストにリマインダ情報の文字列を追加
	}
}
	
	public void actionPerformed(ActionEvent e) {
	}
	
	//getter, setter
	public ReminderList getReminderList() {
		return reminderList;
	}

	public void setReminderList(ReminderList reminderList) {
		this.reminderList = reminderList;
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

}
