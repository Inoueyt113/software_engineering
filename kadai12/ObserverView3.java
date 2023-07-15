
//　課題12-1  No.4 井上祐斗
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.List;
import java.util.ArrayList;

public class ObserverView3 implements Observer {

    private SubjectModel subjectModel;
    private Frame f1;
    private List l1;

    public ObserverView3() {
        f1 = new Frame("View3");
        l1 = new List();

        f1.add(l1, BorderLayout.CENTER);
        f1.setSize(100, 250);
        f1.setVisible(true);
    }

    // subjectModel型のデータを読み書きするメソッド
    public SubjectModel getSubjectModel() {
        return subjectModel;
    }

    public void setSubjectModel(SubjectModel subjectModel) {
        this.subjectModel = subjectModel;
    }

    // 表示内容の更新を行う
    public void update() {
        l1.removeAll();
        ArrayList<String> data = subjectModel.getData();
        for (int i = 0; i < data.size(); i++) {
            System.out.printf("%s ", data.get(i));
            l1.add(data.get(i));
        }
        f1.add(l1);
        f1.pack();
    }
}