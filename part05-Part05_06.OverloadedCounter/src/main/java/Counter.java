/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alanchang
 */
public class Counter {

    private int startValue;

    public Counter() {
        this(0);
    }

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public void increase() {
        this.increase(1);
    }

    public void increase(int num) {
        if (num > 0) {
            this.startValue += num;
        }
    }

    public void decrease() {
        this.decrease(1);
    }

    public void decrease(int num) {
        if (num > 0) {
            this.startValue -= num;
        }
    }

    public int value() {
        return this.startValue;
    }

    @Override
    public String toString() {
        return String.valueOf(this.startValue);
    }
}
