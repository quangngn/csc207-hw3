package com.mcfarevee.test;

//A class for testing the shopping cart for initial testing

import com.mcfarevee.groceries.*;
import com.mcfarevee.groceries.Package;
import com.mcfarevee.groceries.Unit;
import com.mcfarevee.shopping.Cart;

public class ShoppingTest {
  public static void main(String[] args) {
    // The store has 20 pounds of bananas, priced at 50 cents per pound
    BulkFood bananas = new BulkFood("bananas", Unit.POUND, 50, 20);
    // The store has 200 grams of saffron, priced at 1000 cents per gram
    BulkFood saffron = new BulkFood("saffron", Unit.GRAM, 1000, 200);
    Cart cart = new Cart();
    // The customer adds three pounds of bananas to the cart
    cart.addItem(new BulkItem(bananas, Unit.POUND, 3));


    // The customer adds a bag of 1 gram of saffron to the cart
    cart.addItem(new BulkItem(saffron, Unit.GRAM, 1));

    // The customer adds a can opener to the cart, priced $3.489.
    cart.addItem(new NonFood("can opener", new Weight(Unit.OUNCE, 2), 349));

    cart.addItem(new BulkItem(saffron, Unit.GRAM, 1));
    // The customer adds five 6oz packages of macncheez to the cart, each
    // priced at 77 cents.
    
    //Customer adds a number of packages of macncheez, including one measured in different weights
    cart.addItem(new ManyPackages(new Package("macncheez", new Weight(Unit.OUNCE, 6), 77), 5));
    cart.addItem(new Package("macncheez", new Weight(Unit.OUNCE, 6), 77));
    cart.addItem(new ManyPackages(new Package("macncheez", new Weight(Unit.OUNCE, 6), 77), 4));
    cart.addItem(new ManyPackages(new Package("macncheez", new Weight(Unit.GRAM, 6), 77), 1));
   
    //Checking the contents of the cart
    cart.printContents();
    System.out.println("+++++++++++++++++++++++++++++++++");
    cart.merge();
    cart.printContents();
    System.out.println("+++++++++++++++++++++++++++++++++");
    cart.remove("bananas");
    cart.printContents();

  }

}
