package day13.Inheritance;

class Animal {
    void eat() {
        System.out.println("먹이를 먹다.");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("야옹하고 울다.");
    }
}
class Dog extends Animal{
    void bark() {
        System.out.println("멍멍하고 짖다.");
    }
}

public class Inheritance03 {
    public static void main(String[] args) {
        Cat objCat = new Cat();
        Dog objDog = new Dog();

        objCat.meow();
        objCat.eat();
        objDog.bark();
        objDog.eat();
    }
}
