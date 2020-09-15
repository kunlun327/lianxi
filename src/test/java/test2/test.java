package test2;

import java.util.Date;
import java.util.UUID;

public class test {
    public static void main(String[] args) {

      //用户
    User user=new User("韦燕坤","18297406104","淮北");
    //商品
    Goods goods1 = new Goods("矿泉水",1.5,"好喝",new Date());
    Goods goods2 = new Goods("鼠标",9.9,"鼠标形状",new Date());
    Goods[] goods = {goods1,goods2};
    //订单
    Order order = new Order();
    //设置订单号
        order.setNo(UUID.randomUUID().toString());
    //设置用户信息
    //order.setUser(user);
    //设置商品信息
        order.setGoods(goods);
        System.out.println(order);

    //给用户设置订单
    Order[] orders = {order};
        user.setOrder(orders);
        System.out.println(user);
}

}
