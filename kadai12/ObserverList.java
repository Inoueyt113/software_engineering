//課題12-4 No.4 井上祐斗

import java.awt.Frame;
import java.awt.List;
import java.awt.BorderLayout;
import java.util.ArrayList;

public class ObserverList implements Observer {

    private Frame f1;
    private List l1;
    private SubjectData subjectData;

    ObserverList() {
        f1 = new Frame("ObserverList");
        l1 = new List();

        f1.add(l1, BorderLayout.CENTER);
        f1.setSize(100, 250);
        f1.setVisible(true);
    }

    SubjectData getSubjectData() {
        return this.subjectData;
    }

    void setSubjectData(SubjectData d) {
        this.subjectData = d;
    }

    public void update() {
        l1.removeAll();
        ArrayList<Integer> data = subjectData.getData();
        for (int i = 0; i < data.size(); i++) {
            l1.add(data.get(i).toString());
        }
        f1.pack();
    }

}
