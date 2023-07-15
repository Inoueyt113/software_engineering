// 課題13-1 No.4 井上祐斗
public class Main2 {
    public static void main(String[] args) {

        Directory root = new Directory("se-112");
        Directory src = new Directory("src");
        Directory kadai = new Directory("kadai");
        Directory bin = new Directory("bin");

        File ObserverBarGraph = new File("ObserverBarGraph", "java");
        File SubjectData = new File("SubjectData", "java");
        File Observer = new File("Observer", "java");
        File Subject = new File("Subject", "java");

        root.add(src);
        root.add(bin);

        src.add(kadai);
        src.add(Observer);
        src.add(Subject);

        bin.add(kadai);
        bin.add(Observer);
        bin.add(Subject);

        kadai.add(ObserverBarGraph);
        kadai.add(SubjectData);

        MyTreeModel m = new MyTreeModel(root);
        new MyTreeView(m);

    }
}
