package jp.co.kiramex.company.entity;

public class General extends Division {

    @Override //　抽象クラスDivisionの継承により強制的に挿入されたもの
    public void greeting() {
        System.out.println("総務部の皆さんおはようございます");
    }

}
