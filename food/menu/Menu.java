package io.yenniii.food.menu;

public class Menu {
    private int menuID;
    private String name;
    private int price;
    private String restaurantID;

    public Menu(int menuID, String name, int price, String restaurantID) {
        this.menuID = menuID;
        this.name = name;
        this.price = price;
        this.restaurantID = restaurantID;
    }

    public int getMenuID() {
        return menuID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getRestaurantID() {
        return restaurantID;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuID=" + menuID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", restaurantID='" + restaurantID + '\'' +
                '}';
    }
}