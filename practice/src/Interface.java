// インターフェースの定義
interface Flyable {
    void fly();
    void land();
}

interface Swimmable {
    void swim();
    void dive();
}

// 複数のインターフェースを実装するクラス
class Duck implements Flyable, Swimmable {
    private final String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + "が空を飛んでいます。");
    }

    @Override
    public void land() {
        System.out.println(name + "が着陸しました。");
    }

    @Override
    public void swim() {
        System.out.println(name + "が水面を泳いでいます。");
    }

    @Override
    public void dive() {
        System.out.println(name + "が水中に潜りました。");
    }
}

// Flyableインターフェースのみを実装するクラス
class Airplane implements Flyable {
    private final String model;

    public Airplane(String model) {
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println(model + "が高度30,000フィートで飛行中です。");
    }

    @Override
    public void land() {
        System.out.println(model + "が滑走路に着陸しました。");
    }
}

public class Interface {
    public static void main(String[] args) {
        Duck duck = new Duck("カモ");
        Airplane airplane = new Airplane("ボーイング747");

        // Duckの能力を試す
        duck.fly();
        duck.land();
        duck.swim();
        duck.dive();

        // Airplaneの能力を試す
        airplane.fly();
        airplane.land();

        // インターフェースを型として使用
        Flyable flyingObject = duck;
        flyingObject.fly();  // Duckのflyメソッドが呼ばれる

        flyingObject = airplane;
        flyingObject.fly();  // Airplaneのflyメソッドが呼ばれる
    }
}
