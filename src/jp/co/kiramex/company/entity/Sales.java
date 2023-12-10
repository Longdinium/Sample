package jp.co.kiramex.company.entity;

public class Sales extends Employee {
    // フィールド
    private String appointment;

    // コンストラクタ
    public Sales() {

    }

    // 引数ありコンストラクタ
    public Sales(int employeeId, String employeeName, int vitality) {
        /*
        super.setEmployeeId(employeeId);
        super.setEmployeeName(employeeName);
        super.setDivisionName("営業部");
        super.setVitality(vitality);
        */

        // スーパークラスのインスタンスを呼び出し
        super(employeeId, employeeName, "営業部", vitality);
        this.appointment = "未定"; // サブクラス独自のフィールドなのでthis
    }

    // 報告するメソッド
    public void report() {
        super.setVitality(super.getVitality() - 10); //ここの仕組みは？→なんとなくわかった
        System.out.println("今日は10件アポイント取りました");
    }
    @Override
    // 自己紹介メソッドのオーバーライド
    public void introduce() {
        // もともとEmployeeでは右のように記載 vitality = vitality - 10;
        super.setVitality(getVitality() - 10);
        System.out.println("私の名前は" + super.getEmployeeName() + "です。");
            //　プリントするだけなのでgetのみ、だと思う。
        System.out.println("所属部署は" + super.getDivisionName() + "です。");
        System.out.println("今日のアポイント先は" + appointment + "です。");
            // appointmentはサブクラスSalesのフィールドの値なのでsuperやgetはつけない

        /*
        System.out.println("私の名前は" + employeeName + "です。");
        System.out.println("所属部署は" + divisionName + "です。");
        */
    }

    @Override
    // 挨拶をするメソッド、スーパークラスのメソッドをオーバーライド
    public void greeting() {
        super.setVitality(getVitality() - 10);
        System.out.println(super.getDivisionName() + "の皆さん" + "おはようございます");
    }


    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

}
