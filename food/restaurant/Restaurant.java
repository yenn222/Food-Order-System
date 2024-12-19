package io.yenniii.food.restaurant;

public class Restaurant {
    // camel 표기법
    private String restaurantid;
    private String name;
    private String location;
    private String contact;

    public Restaurant(final String restaurantid, final String name, final String location, final String contact) {
        this.restaurantid = restaurantid;
        this.name = name;
        this.location = location;
        this.contact = contact;
    }

    public String getRestaurantId() {
        return restaurantid;
    }

    public String getRestaurantName() { return name; };

    public String getLocation() { return location; }

    public String getContact() { return contact; }

    @Override
    public String toString() {
        return "Restaurant { " +
                "restaurantId = " + restaurantid +
                ", restaurantName = " + name +
                ", location = " + location +
                ", contact = " + contact +
                '}';
    }
}
