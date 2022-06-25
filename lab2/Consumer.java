package com.company.lab2;

public class Consumer {
    public void consume(Storage storage) throws InterruptedException {
        while (true) {
            synchronized (storage.getLocked()) {
                while (storage.getWarehouseGoods().size() == 0) {
                    storage.getLocked().wait();
                }
                Product product = storage.getWarehouseGoods().poll();
                System.out.println(product + " is taken from warehouse");
                System.out.println("Number of products in stock: " + storage.getWarehouseGoods().size());
                storage.getLocked().notify();
            }
            Thread.sleep(1000);
        }
    }
}