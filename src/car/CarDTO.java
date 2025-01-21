package car;

public class CarDTO {
    private String model;
    private String owner;
    private int speed;

    public CarDTO () {}
    public CarDTO(String model, String owner, int speed) {
        this.model = model;
        this.owner = owner;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
