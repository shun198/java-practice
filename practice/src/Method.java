public class Method {
    public static void main(String[] args) {
        greet("田中さん");
        int sum = add(5, 3);
        System.out.println("5 + 3 = " + sum);

        double circleArea = calculateCircleArea(5.0);
        System.out.println("半径5の円の面積: " + circleArea);
    }

    // 引数を受け取り、戻り値のないメソッド
    public static void greet(String name) {
        System.out.println("こんにちは、" + name + "!");
    }

    // 2つの引数を受け取り、整数を返すメソッド
    public static int add(int a, int b) {
        return a + b;
    }

    // doubleの引数を受け取り、doubleを返すメソッド
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
