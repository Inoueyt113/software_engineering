// 課題13-4 No.4 井上祐斗

public class Interface extends Class {

    // 継承したClassのフィールド

    // nameはprotectedに変更
    // protected String name;
    // private ArrayList<Component> children;

    public Interface(String n) {
        super(n);
    }

    // 継承したclassのメソッド
    // public void add(Component n) {
    // children.add(n);
    // }

    // public ArrayList<Component> getChildren() {
    // return children;
    // }

    // toStringは変更
    public String toString() {
        return ("<<Interface>> " + super.name);
    }
}
