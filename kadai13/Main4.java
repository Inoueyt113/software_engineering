// 課題13-3 No.4 井上祐斗
public class Main4 {
    public static void main(String[] args) {

        Class car = new Class("Car");
        Class date = new Class("Date");

        Member cm1 = new Member("num", "int", "field");
        Member cm2 = new Member("gas", "double", "field");
        Member cm3 = new Member("show", "void", "method");

        Member dm1 = new Member("year", "int", "field");
        Member dm2 = new Member("month", "int", "field");
        Member dm3 = new Member("day", "int", "field");
        Member dm4 = new Member("toString", "String", "method");

        car.add(cm1);
        car.add(cm2);
        car.add(cm3);
        car.add(date);

        date.add(dm1);
        date.add(dm2);
        date.add(dm3);
        date.add(dm4);

        // 表示
        MyTreeModel m = new MyTreeModel(car);
        new MyTreeView(m);
    }
}
