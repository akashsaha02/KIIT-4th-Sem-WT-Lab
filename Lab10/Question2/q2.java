package WT_LAB.Lab10.Question2;

import java.util.*;

interface Motor {
    int capacity = 5;

    void run();

    void consume();
}

class WasingMachine implements Motor {
    public void run() {
        System.out.println("Washing Machine is running");
    }

    public void consume() {
        System.out.println("Washing Machine is being used and consuming electricity");
    }

}

public class q2 {
    public static void main(String[] args) {
        WasingMachine wm = new WasingMachine();
        wm.consume();
        wm.run();
        System.out.println("The capacity of the washing machine is: " + wm.capacity + " liters");
    }
}
