package day13.homework.class실습;

public class Tv {
    private String color;
    private boolean power;
    private int channel;

    public Tv() {
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }

    public void power() {
        if (this.power) {
            this.power = false;
        } else {
            this.power = true;
        }
    }
    public void channelUp() {
        this.channel++;
    }
    public void channelDown() {
        this.channel--;
    }
    public void print() {
        System.out.printf("color :%s  power:%b  channel:%d%n",
                this.color, this.power, this.channel);
    }
}
