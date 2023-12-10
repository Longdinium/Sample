package jp.co.kiramex.company.entity;

public abstract class Division {
    // フィールドの定義
    private String employeeName; // 社員名

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // 抽象メソッドgreetingの定義
        // 抽象メソッドは、スーパークラス側ではメソッドの詳細を記述せず、
        // サブクラスのほうで実際の処理内容を記述するために使います。
        // つまり、抽象クラスを継承したサブクラスではオーバーライドが強制される
    public abstract void greeting();

}
