package week05.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerTest04 {
    /*
    Bir product sınıfı oluşturalım isim ve fiyatı olsun
    AllArgsConstractor'ı olsun
    Encapsulaction kurallarına uygun bir şekilde hazırlayalım.
     */
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product("laptop", 400000));
        productsList.add(new Product("Phone", 800000));
        productsList.add(new Product("Tablet", 500000));

        //consumer kullanarak her bir ürünün adını ve fiyatını yazdıralım.

        Consumer<Product> productConsumer=product -> {
            System.out.println("Name  :" + product.getName());
            System.out.println(("price : "+ product.getPrice()));

        };
        productsList.forEach(productConsumer);
    }
}
