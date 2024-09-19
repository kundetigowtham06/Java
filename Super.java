class A {

  int x = 90;
}

class Super extends A {

  int x = 89;

  void display() {
    System.out.println(x);
    System.out.println(super.x);
  }

  public static void main(String[] args) {
    Super obj = new Super();
    obj.display();
  }
}
