package com.mcfarevee.groceries;

/*
 * This class organizes a particular quantity of BulkFoods into a single entry for the cart
 */

public class BulkItem implements Item {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  // The name of the food group
  private BulkFood food;

  // The unit which the food is measured in
  private Unit unit;

  // The amount of that food
  private int amount;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  // Create a new BulkItem
  public BulkItem(BulkFood food, Unit unit, int amount) {
    this.food = food;
    this.unit = unit;
    this.amount = amount;
    // Specify the nature of the above-described fields
  }

  // +-----------+---------------------------------------------------
  // | Accessors |
  // +-----------+

  // Get the Weight (as described in the Weight class) of the BulkItem
  @Override
  public Weight getWeight() {
    return new Weight(unit, amount);
  }

  // Get the price of the BulkItem
  @Override
  public int getPrice() {
    return food.getPricePerUnit() * this.amount;
  }

  // Get the BulkFood used by a BulkItem
  public BulkFood getFood() {
    return this.food;
  }

  // Get the unit used by this
  public Unit getUnit() {
    return this.unit;
  }

  // Get the amount of the food
  public int getAmount() {
    return this.amount;
  }

  // Get a string description of the BulkItem
  public String toString() {
    return amount + " " + unit.name + " of " + food.getName();
  }

  // Compare
  public boolean equals(BulkItem b) {
    if (this.food.equals( b.getFood()) && this.unit == b.getUnit() && this.amount == b.getAmount()) {
      return true;
    } else {
      return false;
    }

  }

  //Return the name of the food
  public String getName() {
    return this.getFood().getName();
  }


}
