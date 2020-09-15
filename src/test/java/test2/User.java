package test2;

import java.util.Arrays;

public class User {
    private String name;
    private String phone;
    private String address;
    //订单一对多关联
    private Order order[];
    public User(String name, String phone, String address, Order[] order) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.order = order;
    }

    public User(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Order[] getOrder() {
        return order;
    }

    public void setOrder(Order[] order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", order=" + Arrays.toString(order) +
                '}';
    }
}
