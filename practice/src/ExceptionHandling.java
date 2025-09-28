import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        // ---------- ファイル読み込み ----------
        try (Scanner scanner = new Scanner(new File("example.txt"))) {
            // try-with-resources構文を使用して、Scannerを自動的に閉じる
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ファイル読み込み中に予期せぬエラーが発生しました: " + e.getMessage());
        }

        // ---------- 配列アクセス ----------
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);  // この行で例外が発生

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲外にアクセスしました: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("配列処理中に予期せぬエラーが発生しました: " + e.getMessage());
        }

        // ---------- 共通の終了処理 ----------
        System.out.println("プログラムの実行を終了します。");
    }
}
