public class ReminderList {
	//保持するデータ
	private Reminder[] reminder;

	//コンストラクタ
	public ReminderList(){
		//配列の作成
		this.reminder = new Reminder[10];
		
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
	}
	
	
    //getter, setter
	public Reminder[] getReminder() {
		return reminder;
	}

	public void setReminder(Reminder[] reminder) {
		this.reminder = reminder;
	}

}
