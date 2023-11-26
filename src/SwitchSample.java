
public class SwitchSample {

    public static void main(String[] args) {
        int score = 59; // 成績

        // rankingメソッドを呼び出し、ランクを取得
        int rank = ranking(score);

        switch(rank){
        // scoreが0～59までの場合
        case 0 :
        case 1 :
        case 2 :
        case 3 :
        case 4 :
        case 5 :
            System.out.println("赤点です...補講を行ないます");
            break;
        // scoreが60～79までの場合
        case 6 :
        case 7 :
            System.out.println("合格です！");
            break;
        // scoreが80～99までの場合
        case 8 :
        case 9 :
            System.out.println("よくできました！");
            break;
        // scoreが100の場合
        case 10:
            System.out.println("満点です！ご褒美をあげます！");
            break;
        // scoreが0を下回るまたは、100を超えた場合
        default:
            System.out.println("点数は0以上100以内で代入してください。");
            break;
        }
    }

    public static int ranking(int score) {
        // 引数scoreの値が0を下回る場合
        if (score < 0) {
            // 下限の無効な値として-1を返す
            return -1;
        // 引数scoreの値が100を超えた場合
        } else if (score > 100) {
            // 上限の無効な値として11を返す
            return 11;
        } else {
            // 有効な値としてランクを算出し、結果を返す
            return score / 10;
        }
    }

}