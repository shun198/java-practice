public class Array {
    public static void main(String[] args) {
        // 整数の配列を宣言と初期化
        int[] numbers = {1, 2, 3, 4, 5};

        // 配列の要素にアクセス
        System.out.println("3番目の要素: " + numbers[2]);

        // 配列の長さを取得
        System.out.println("配列の長さ: " + numbers.length);

        // 配列の全要素を表示
        System.out.println("配列の全要素:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 2次元配列
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("2次元配列の要素:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
