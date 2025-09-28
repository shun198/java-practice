public class ControlStructures {
    public static void main(String[] args) {
        int score = 85;

        // if-else文
        if (score >= 90) {
            System.out.println("優秀です！");
        } else if (score >= 80) {
            System.out.println("良好です。");
        } else {
            System.out.println("もう少し頑張りましょう。");
        }

        // for文
        System.out.println("1から5までの数を表示します：");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while文
        int count = 0;
        while (count < 3) {
            System.out.println("カウント: " + count);
            count++;
        }
    }
}
