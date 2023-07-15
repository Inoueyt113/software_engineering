
// 課題13-3 No.4 井上祐斗
import java.util.ArrayList;

//葉を表すクラス
public class Member implements Component {
    private String name;
    private String type;
    private String sort;

    public Member(String n, String t, String s) {
        this.name = n;
        this.type = t;
        this.sort = s;
    }

    public ArrayList<Component> getChildren() {
        return null;
    }

    public String toString() {
        String str = "";

        if (sort == "field")
            str = this.name + ": " + type;

        else if (sort == "method")
            str = name + "(): " + type;

        return str;
    }

}
