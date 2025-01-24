package day13.Inheritance_03;

public class SmartPhone extends Phone {

    public SmartPhone() {}

    public SmartPhone(String model, String color) {
        super();
        System.out.println("SmartPhone model 과 color" + super.getBander() + super.getModel() + super.getColor());
    }
}
