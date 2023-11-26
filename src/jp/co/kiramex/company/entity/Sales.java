package jp.co.kiramex.company.entity;

public class Sales extends Employee {
    // フィールド
    private String appointment;

    // コンストラクタ
    public Sales() {

    }

    // 引数ありコンストラクタ
    public Sales(int employeeId, String employeeName, int vitality) {
        super.setEmployeeId(employeeId);
        super.setEmployeeName(employeeName);
        super.setDivisionName("営業部");
        super.setVitality(vitality);
        this.appointment = "未定"; // サブクラス独自のフィールドなのでthis
    }

    // 報告するメソッド
    public void report() {
        super.setVitality(super.getVitality() - 10);
        System.out.println("今日は10件アポイント取りました");
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

}
