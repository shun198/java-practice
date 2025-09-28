import java.util.ArrayList;
import java.util.List;

// ジェネリッククラスの定義
class Box<T> {
    private T content;

    public void put(T item) {
        this.content = item;
    }

    public T get() {
        return content;
    }
}

// ジェネリックメソッドの定義
class Utilities {
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Generics {
    public static void main(String[] args) {
        // ジェネリッククラスの使用
        Box<Integer> intBox = new Box<>();
        intBox.put(10);
        System.out.println("整数ボックスの中身: " + intBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.put("こんにちは、ジェネリクス！");
        System.out.println("文字列ボックスの中身: " + stringBox.get());

        // ジェネリックメソッドの使用
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"りんご", "バナナ", "オレンジ"};

        System.out.println("整数配列:");
        Utilities.printArray(intArray);

        System.out.println("文字列配列:");
        Utilities.printArray(stringArray);

        // ジェネリックコレクションの使用
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(2.71);
        System.out.println("ダブルのリスト: " + doubleList);
    }
}
