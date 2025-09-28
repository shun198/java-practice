import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        // Listの使用例（ArrayList）
        List<String> fruits = new ArrayList<>();
        fruits.add("りんご");
        fruits.add("バナナ");
        fruits.add("オレンジ");
        fruits.add("バナナ");  // 重複を許可

        System.out.println("フルーツリスト: " + fruits);
        System.out.println("2番目のフルーツ: " + fruits.get(1));

        // Setの使用例（HashSet）
        Set<String> uniqueFruits = new HashSet<>(fruits);
        System.out.println("ユニークなフルーツセット: " + uniqueFruits);  // 重複が除去される

        // Mapの使用例（HashMap）
        Map<String, Integer> fruitInventory = new HashMap<>();
        fruitInventory.put("りんご", 50);
        fruitInventory.put("バナナ", 30);
        fruitInventory.put("オレンジ", 40);

        System.out.println("フルーツ在庫: " + fruitInventory);
        System.out.println("りんごの在庫: " + fruitInventory.get("りんご"));

        // イテレーションの例
        System.out.println("フルーツリストの反復処理:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("フルーツ在庫の反復処理:");
        for (Map.Entry<String, Integer> entry : fruitInventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // ソートの例
        Collections.sort(fruits);
        System.out.println("ソート後のフルーツリスト: " + fruits);

        // 検索の例
        boolean hasMango = fruits.contains("マンゴー");
        System.out.println("リストにマンゴーが含まれていますか？ " + hasMango);
    }
}
