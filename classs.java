abstract class Animal{
    private String name;

    Animal(String name) {this.name = name; }

    public String getName() {return name; }

    abstract void sound();

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    Dog(String name) {super(name);}

    @Override
    void sound() {System.out.println(getName() + " says woof");}
}


class Cat extends Animal{
    Cat(String name) {super(name);}

    @Override
    void sound() {System.out.println(getName() + " says meow");}
}


class Main{
    public static void main(String []args) {
        Animal[] animal = {new Dog("work"), new Cat("Kitty")};

        for (Animal a: animal) {
            a.eat();
            a.sound();
        }

    }
}