
abstract class Shape {
    
    abstract double Area();
}

class Circle extends Shape {
    double r;

  
    Circle(double r) {
        this.r = r;
    }

    
    double Area() {
        return 3.14 *r* r;
    }
}


class Rectangle extends Shape {
    int l, w;
    Rectangle(int l,int w) {
        this.l= l;
        this.w= w;
    }

    double Area() {
        return l*w;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(
 
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of Circle=" + circle.Area());
        System.out.println("Area of Rectangle=" + rectangle.Area());
    }
}
