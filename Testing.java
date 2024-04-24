/** 
 * What I learnt: 
 *  a is least feature rich
 *  b is constructed with Subclass but can only access Superclass
 *  c has access to both Superclass and Subclass
 */


public class Testing {
    public static void main(String[] args) {
        
        Superclass a = new Superclass("Nice", 0, 0);
        a.method1();
        Superclass b = new Subclass("Hi", 0, 0); 
        b.method1();
        Subclass c = new Subclass("Hi", 0, 0); 
        c.method3(); 
    }
}

class Superclass {

    private int a;
    private int b;

    public Superclass(String toPrint, int a, int b) {

        System.out.println(toPrint);
        this.a = a; 
        this.b = b; 
    }

    public void method1() {
        
        System.out.println("This is method 1");
    }

    private void method2() {
        
        System.out.println("This is method 2");
    }
}

class Subclass extends Superclass {

    public Subclass(String toPrint, int a, int b) {

        super(toPrint, a, b); 
        System.out.println("Subclass is called");
    }

    public void method3() {
        
        System.out.println("This is method 3");
    }

    private void method4() {

        System.out.println("This is method 4");
    }
}