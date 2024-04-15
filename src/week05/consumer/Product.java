package week05.consumer;

import java.util.function.Predicate;

public class Product {

    private String name;
    private Integer price;

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {

        return name;
    }
}


