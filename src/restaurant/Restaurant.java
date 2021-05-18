package restaurant;

public class Restaurant {
    public static void main(String[] args){
        Menu natesDeli = new Menu();
        MenuItem turkeySandwich = new MenuItem(4.99, "Turkey Sandwich", "Main Course");
        MenuItem potatoSalad = new MenuItem(2.49, "Potato Salad", "Appetizer");
        MenuItem lavaCake = new MenuItem(3.89, "Chocolate Lava Cake", "Dessert");
        MenuItem chocolateCake = new MenuItem(3.89, "Chocolate Lava Cake", "Dessert");
        potatoSalad.setIsItemNew(false);
        turkeySandwich.setIsItemNew(false);
        natesDeli.addItem(turkeySandwich);
        natesDeli.addItem(potatoSalad);
        natesDeli.addItem(lavaCake);
        natesDeli.setDate("2020-11-20");
        System.out.println(natesDeli);
        natesDeli.deleteItem(potatoSalad);
        natesDeli.setDate("2021-5-11");
        System.out.println(natesDeli);
        System.out.println(potatoSalad);
        System.out.println(lavaCake.equals(chocolateCake));
        natesDeli.addItem(potatoSalad);
        natesDeli.addItem(chocolateCake);


    }
}
