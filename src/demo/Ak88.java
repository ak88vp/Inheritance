package demo;

public class Ak88 {
    private String name ="Dũng";
    public int money=10;

    public Ak88(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public Ak88() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Ak88{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
