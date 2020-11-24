package javaⅣ;

class Main5 {
  public static void main(String[] args) {
    Person5 person1 = new Person5();
    person1.hello();

    // person1のインスタンスフィールドnameに「Kate Jones」をセットしてください
    person1.name = "Kate Jones";
    // person1のインスタンスフィールドnameの値を出力してください
    System.out.println(person1.name);

    Person5 person2 = new Person5();
    person2.hello();

    // person2のインスタンスフィールドnameに「John Christopher Smith」をセットしてください
    person2.name = "John Christopher Smith";
    // person2のインスタンスフィールドnameの値を出力してください
    System.out.println(person2.name);
  }
}
