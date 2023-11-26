
public class ObjectSample02 {

    public static void main(String[] args) {
        Employee emp01 = new Employee(); //　初期化をしている？
            // emp01loyeeクラスの変数emp01に対し、右辺のnewによりインスタンスを生成して代入
            // この行の実行により、emp01loyeeクラスが一つのインスタンスとして実体化し、変数emp01に格納されるので、
            // emp01を実在のものとして扱えるようになる
        emp01.employeeName = "大島";
        emp01.divisionName = "営業部";
        emp01.vitality = 150;
        emp01.introduce();
        emp01.showVitality();

        Employee emp02 = new Employee();
        emp02.employeeName = "原川";
        emp02.divisionName = "営業部";
        emp02.vitality = 250;
        emp02.introduce();
        emp02.greeting();
        emp02.report();
        emp02.showVitality();

    }

}
