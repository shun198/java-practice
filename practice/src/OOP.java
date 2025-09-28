// 学生クラスの定義
class Student {
    // フィールド（属性）
    // finalを追加することで、オブジェクト生成後に属性が変更されないようにする
    private final String name;
    private final int age;
    private final String studentId;

    // コンストラクタ
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // メソッド
    public void introduce() {
        System.out.println("こんにちは、私は" + name + "です。" + age + "歳で、学生番号は" + studentId + "です。");
    }

    // getter メソッド
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }
}

public class OOP {
    public static void main(String[] args) {
        // Studentクラスのオブジェクトを作成
        Student student1 = new Student("佐藤花子", 20, "S12345");
        Student student2 = new Student("鈴木一郎", 22, "S67890");

        // オブジェクトのメソッドを呼び出す
        student1.introduce();
        student2.introduce();

        // getterメソッドを使用してオブジェクトの属性にアクセス
        System.out.println(student1.getName() + "の年齢: " + student1.getAge());
        System.out.println(student2.getName() + "の学生番号: " + student2.getStudentId());
    }
}
