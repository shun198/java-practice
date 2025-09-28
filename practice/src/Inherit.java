// 基底クラス（親クラス）
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "が食事をしています。");
    }

    public void sleep() {
        System.out.println(name + "が眠っています。");
    }
}

// 派生クラス（子クラス）
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + "がワンワン吠えています。");
    }

    // メソッドのオーバーライド
    @Override
    public void eat() {
        System.out.println(name + "が骨を食べています。");
    }
}

// 別の派生クラス
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(name + "がニャーと鳴いています。");
    }

    // メソッドのオーバーライド
    @Override
    public void eat() {
        System.out.println(name + "が魚を食べています。");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Dog dog = new Dog("ポチ");
        Cat cat = new Cat("タマ");

        dog.eat();  // オーバーライドされたメソッド
        dog.sleep(); // 親クラスから継承したメソッド
        dog.bark();  // Dog クラス固有のメソッド

        cat.eat();   // オーバーライドされたメソッド
        cat.sleep(); // 親クラスから継承したメソッド
        cat.meow();  // Cat クラス固有のメソッド
    }
}
