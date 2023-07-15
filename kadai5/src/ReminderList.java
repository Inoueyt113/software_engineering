public class ReminderList {
	//保持するデータ
	private Reminder[] reminder;
	
	private View view;
	
	//コンストラクタ
	public ReminderList(){
		//課題5-2 保持するリマインダーの個数を増やす
		this.reminder = new Reminder[20];
		
		//配列の初期化
		for(int i=0;i<10;i++) {
			reminder[i] = null;
		}
	}

	//メソッド
	public void show() {
		System.out.printf("----------Reminder List----------\n");
		for(int i=0; i<10; i++) {
			if(reminder[i] == null) {
			}else {
				System.out.printf("%d: ",i);
				this.reminder[i].show();
			}
		}
		System.out.printf("----------End of List----------\n\n");

	}

	public void add(int i, Reminder r){
		this.reminder[i] = r;
		view.updata();
	}
	
	public void remove(int i) {
		reminder[i] = null;
		view.updata(); 
		}
	
	public void clear() {
		reminder = new Reminder[10];
		view.updata(); 
		}
	
    //getter, setter
	public Reminder[] getReminder() {
		return reminder;
	}

	public void setReminder(Reminder[] reminder) {
		this.reminder = reminder;
	}
	
	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}
	
	public Reminder returnReminder(int i) {
		return reminder[i];
	}


}