//課題12-3　No.4 井上祐斗
public class Main4 {
    public static void main(String[] args) {
        // Observerを作る
        ObserverLineGraph lg = new ObserverLineGraph();
        ObserverBarGraph bg = new ObserverBarGraph();

        // Subjectを作る
        SubjectData d = new SubjectData();

        // Observerからsubjectを参照する
        lg.setSubjectData(d);
        bg.setSubjectData(d);

        d.addObserver(lg);
        d.addObserver(bg);

        // 更新した時の通知を出し、各observerを更新
        d.notifyObserver();

    }
}
