package klasywew;

public class Main {
    public static void main(String[] args) {
        A zewnetrzna = new A();
        A.B temp = zewnetrzna.new B();
        A.C wewnetrzna = new A.C();
    }
}

class A {
    A() {
        System.out.println("Jestem z klasy zewnętrznej A");
    }
    class B {
        B() {
            System.out.println("Jestem z klasy zagnieżdżonej B");
        }
        void cos() {
            test = 5;
        }

    }
    static class C {
        C() {
            System.out.println("Jestem z klasy zagnieżdżonej C");
        }
    }
   private int test;
}