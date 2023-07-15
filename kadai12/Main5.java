//課題12-4 No.4 井上祐斗
public class Main5 {
    public static void main(String[] args) {
        // Observerを作る
        ObserverLineGraph lg = new ObserverLineGraph();
        ObserverBarGraph bg = new ObserverBarGraph();
        ObserverList li = new ObserverList();

        // Subjectを作る
        SubjectData d = new SubjectData();

        // Observerからsubjectを参照する
        lg.setSubjectData(d);
        bg.setSubjectData(d);
        li.setSubjectData(d);

        // subjectにObserverを登録
        d.addObserver(lg);
        d.addObserver(bg);
        d.addObserver(li);

        // 更新した時の通知を出し、各observerを更新
        d.notifyObserver();

    }
}
