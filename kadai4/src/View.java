import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View implements ActionListener {
	//保持するデータ
	private ReminderList reminderList;
	private Controller controller;
	
	//field for output 
	private Frame f1;
	private List l1;
	
	//field for input
	private Frame f2;
	private TextField index, name, priority;
	private Button add;
	
	//コンストラクタ
	public View() {	
		//GUI for output
		f1 = new Frame();
		l1 = new List(10);
		f1.add(l1, BorderLayout.CENTER);
		f1.setSize(500, 300);
		f1.setVisible(true);
		l1.addActionListener(this);
		
		//課題4-2　入力のためのGUI
		f2 = new Frame();
		index = new TextField("",1);
		name = new TextField("",10);
		priority = new TextField("",1);
		add = new Button("add");
		f2.setLayout(new FlowLayout(FlowLayout.LEFT));
		f2.add(index);
		f2.add(name);
		f2.add(priority);
		f2.add(add);
		f2.pack();
		f2.setVisible(true);
		add.addActionListener(this);
	}
	
	//課題4-3　ボタンが押された時の処理
	public void actionPerformed(ActionEvent e) {
		int i, p;
		String n;
		if(e.getSource()==add) {
			i = Integer.parseInt(index.getText());
			p = Integer.parseInt(priority.getText());
			n = name.getText();
			controller.add(i,n,p);
		}
		
	//課題4-4 ダブルクリックでの処理
		 if(e.getSource()==l1) {
	            int s = l1.getSelectedIndex();
	            
	            Reminder[] l = reminderList.getReminder();
	            
	            //表示
	            index.setText(String.valueOf(s));
	            name.setText(l[s].getName());
	            priority.setText(String.valueOf(l[s].getPriority()));
	        }
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
