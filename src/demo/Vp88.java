package demo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Vp88 extends Ak88 {
    public int a = 0;
    public Vp88(int a) {
        this.a = a;
    }

    public Vp88(String name, int money, int a) {
        super(name, money);
        this.a = a;
    }

    @Override
    public String toString() {
        return "Vp88{" +
                "money=" + money +
                ", a=" + a +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Vp88 vp88 = new Vp88(2);
        System.out.println(vp88.getMoney());
        Vp88 test=new Vp88("ẤM",240399,100);
        System.out.println(test);


    }
}

