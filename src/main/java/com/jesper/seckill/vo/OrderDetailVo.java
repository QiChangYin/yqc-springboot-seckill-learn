package com.jesper.seckill.vo;

import com.jesper.seckill.bean.OrderInfo;
import com.jesper.seckill.bean.User;

/**
 * Created by jiangyunxiong on 2018/5/28.
 */
public class OrderDetailVo {
    private GoodsVo goods;
    private OrderInfo order;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;
    public GoodsVo getGoods() {
        return goods;
    }
    public void setGoods(GoodsVo goods) {
        this.goods = goods;
    }
    public OrderInfo getOrder() {
        return order;
    }
    public void setOrder(OrderInfo order) {
        this.order = order;
    }
}
