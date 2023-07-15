
// 課題13-3 No.4 井上祐斗
import java.util.ArrayList;

// 枝を表すクラス
public class Class implements Component {

    protected String name;
    private ArrayList<Component> children;

    public Class(String n) {
        name = n;
        children = new ArrayList<Component>();
    }

    public void add(Component n) {
        children.add(n);
    }

    public ArrayList<Component> getChildren() {
        return children;
    }

    public String toString() {
        return name;
    }

}
