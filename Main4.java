class Main4 {

  String languages;

  // constructor accepting single value
  Main4(String lang) {
    languages = lang;
    System.out.println(languages + " Programming Language");
  }

  public static void main(String[] args) {

    // call constructor by passing a single value
    Main4 obj1 = new Main4("Java");
    Main4 obj2 = new Main4("Python");
    Main4 obj3 = new Main4("C");
  }
}