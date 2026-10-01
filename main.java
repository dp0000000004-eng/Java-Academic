class A {
    
    protected  int age;
    private String car = "bmw";
    
    void setAge(int a){
        age = a;
    }

    public String name = "modiji";

    void displayAge(){
        System.out.println(age);
    }

    // System.out.printlnage(car);

}


// public class main{
//     public static void main(String []args){
//         A obj = new A();
//         obj.add();
//     }
// }



// public class main{
//     public static void main(String []aggs){
//         A obj = new A();
//         obj.setAge(18);
//         obj.displayAge();
//     }
// }

class B extends A {
    void show() {
        System.out.println(age);

    }
}

public class main{
    public static void main(String []args) {
        B obj = new B();
        obj.age = 18;
        obj.show();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}

