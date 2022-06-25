package com.company.lab2;

import java.util.LinkedList;
import java.util.Queue;

public class Storage {
    private Queue<Product> warehouseGoods = new LinkedList();
    private int limitOfProducts;
    private final Object locked = new Object();

    public Storage(int limitOfProducts) {
        this.limitOfProducts = limitOfProducts;
    }

    public Queue<Product> getWarehouseGoods() {
        return warehouseGoods;
    }

    public void setWarehouseGoods(Queue<Product> warehouseGoods) {
        this.warehouseGoods = warehouseGoods;
    }

    public int getLimitOfProducts() {
        return limitOfProducts;
    }

    public void setLimitOfProducts(int limit) {
        this.limitOfProducts = limit;
    }

    public Object getLocked() {
        return locked;
    }
}