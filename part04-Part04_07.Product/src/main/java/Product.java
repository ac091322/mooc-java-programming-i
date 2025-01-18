/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alanchang
 */
public class Product {

    private final double price;
    private final int quantity;
    private final String name;

    public Product(String intialName, double intialPrice, int intialQuantity) {
        this.name = intialName;
        this.price = intialPrice;
        this.quantity = intialQuantity;
    }

    public void printProduct() {
        System.out.println(String.format("%s, %f, %d", this.name, this.price, this.quantity));
    }
}
