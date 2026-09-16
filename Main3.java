class Main3 {

  int i;

  // constructor with no parameter
  private Main3() {
    i = 5;
    System.out.println("Constructor is called");
  }

  public static void main(String[] args) {

    // calling the constructor without any parameter
    Main3 obj = new Main3();
    System.out.println("Value of i: " + obj.i);
  }
}