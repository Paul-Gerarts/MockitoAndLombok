package be.juvo.introductionarycourse.MockitoAndLombok.mockito;

import lombok.Data;

import java.util.List;

@Data
public class Product {

    private String name = "product";
    private Integer code = 1322132155;
    private Double price = 1.1D;
    private List<Product> cart;

    Double buySomething(int amount){
       return this.price * amount;
    }

    void addToCart(Product product){
        this.cart.add(product);
    }
}
