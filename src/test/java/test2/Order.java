package test2;

import java.util.Arrays;

public class Order {
    private String no;
    //一对多 商品
    private Goods Goods[];
    //一对一用户
    private User user;

    public Order(String no, test2.Goods[] goods, User user) {
        this.no = no;
        Goods = goods;
        this.user = user;
    }

    public Order() {
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public test2.Goods[] getGoods() {
        return Goods;
    }

    public void setGoods(test2.Goods[] goods) {
        Goods = goods;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "no='" + no + '\'' +
                ", Goods=" + Arrays.toString(Goods) +
                ", user=" + user +
                '}';
    }
}
