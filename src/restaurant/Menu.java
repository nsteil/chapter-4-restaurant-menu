package restaurant;


import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Date;




public class Menu {
    ArrayList<MenuItem> menuListings = new ArrayList<>();
    Date lastUpdated = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String menuUpdate = simpleDateFormat.format(lastUpdated);

    public void addItem(MenuItem newItem){

        this.menuListings.add(newItem);
    }

    public void deleteItem(MenuItem itemToBeDeleted){
        this.menuListings.remove(itemToBeDeleted);
    }

    public Date getDate(){
        return lastUpdated;
    }

    public void setDate (String newUpdate) {
        this.menuUpdate= newUpdate;
    }

    @Override
    public String toString(){
        String printOut = new String();
        for (MenuItem listing : menuListings){
            printOut += listing + "\n";
        }
        printOut += "The menu was last update on " + menuUpdate;
        return printOut;
    }

}
