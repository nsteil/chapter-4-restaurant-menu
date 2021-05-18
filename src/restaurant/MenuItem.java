package restaurant;

import java.util.*;

public class MenuItem {
  private double price;
  private String description;
  private String category;
  private final Date dateAdded;
  public boolean isItemNew;


  public MenuItem (double price, String description, String category){
      this.price = price;
      this.description = description;
      this.category = category;
      this.dateAdded = new Date();
      this.isItemNew = true;
  }

  @Override
  public String toString(){
      if (this.isItemNew == true) {
          return "NEW! " + category + " - " + description + ": " + price;
      } else {
          return category + " - " + description + ": " + price;
      }
  }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category);
    }

    public boolean equals(Object toBeCompared){
      if (toBeCompared == this) {
          return true;
      }
      if (toBeCompared == null){
          return false;
      }
      if (toBeCompared.getClass() != getClass()) {
          return false;
      }
      MenuItem theItem = (MenuItem) toBeCompared;
      return theItem.getPrice() == getPrice() && theItem.getCategory() == getCategory() && theItem.getDescription() == getDescription();
  }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public boolean getIsItemNew() {
        return isItemNew;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setDescription(String description) {
        this.description = description;
    }

    void setCategory(String category){
        if (category.equals("Appetizer") || category.equals("Main Course") || category.equals("Dessert")){
            this.category = category;
        }

    }

    void setIsItemNew(boolean aisItemNew){
        isItemNew = aisItemNew;
    }

}

