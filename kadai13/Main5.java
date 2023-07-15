// 課題13-4 No.4 井上祐斗

public class Main5 {
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

        // 変更
        Interface cmp = new Interface("Component");

        Member cpm1 = new Member("toString", "String", "method");
        Member cpm2 = new Member("getChildren", "ArrayList<Component>", "method");

        cmp.add(cpm1);
        cmp.add(cpm2);

        car.add(cmp);

        // ここまで

        // 表示
        MyTreeModel m = new MyTreeModel(car);
        new MyTreeView(m);

    }
}
