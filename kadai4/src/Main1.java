public class Main1 {
    public static void main(String[] args) {
    	
        //View,Model,Controllerを作成する
        View view = new View();
        ReminderList list = new ReminderList();
        Controller controller = new Controller();
        
        //viewとコントローラーを相互に関連付ける
        view.setController(controller);
        view.setReminderList(list);
        
        //Controllerとview,reminderListを関連付ける
        controller.setReminderList(list);
        controller.setView(view);
        
        //ViewとModelを相互に関係付ける
        list.setView(view);

        //まずリストに追加するReminderを作る
        Reminder r1 = new Reminder();
        r1.setName("ミルクを買う");
        r1.setPriority(3);
        
        //Mainからlistに追加
        list.add(0,r1);
        
        //Mainからlistのi番目を削除
        controller.remove(0);
        
        //標準出力への表示
        list.show();
    }
}
