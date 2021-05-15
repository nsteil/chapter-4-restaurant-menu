package restaurant;

import java.util.*;

public class MenuItem {
  private double price;
  private String description;
  private String category;
  private Date dateAdded = new Date();
  public boolean isItemNew;


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
        this.category = category;
    }

    void setIsItemNew(boolean isItemNew){
        this.isItemNew = isItemNew;
    }
}

