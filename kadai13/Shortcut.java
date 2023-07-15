// 井上祐斗　No.4 課題13-2
public class Shortcut extends File {

    private String path;

    // Fileから継承したフィールド
    // private String name;
    // private String ext;

    public Shortcut(String n, String e, String p) {
        super(n, e);
        this.path = p;
    }

    public String toString() {
        String str = super.toString();
        str += " -> " + this.path;
        return str;
    }

}
