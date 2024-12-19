package io.yenniii.food.customer;

public class Customer {
    // camel 표기법
    private String customerid;
    private String name;
    private String contact;
    private String address;

    public Customer(final String customerid, final String name, final String contact, final String address){
        this.customerid = customerid;
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public String getCustomerId() { return customerid; }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer { " +
                "customerId = " + customerid +
                ", customerName = " + name +
                ", contact = " + contact +
                ", address = " + address +
                '}';
    }
}
