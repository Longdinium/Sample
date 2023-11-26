
public class RPG {

    public static void main(String[] args) {
        // 勇者と敵キャラを生成
        Character hero = new Character("勇者", 10, 5, 3);
        Character slime = new Character("スライム", 5, 2, 2);

        hero.attack(slime); // 勇者がスライムに攻撃
        slime.attack(hero); // スライムが勇者に攻撃

    }

}
