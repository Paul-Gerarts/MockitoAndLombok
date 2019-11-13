package be.juvo.introductionarycourse.MockitoAndLombok.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class ProductTest {

    private Product product;

    @BeforeEach
    public void setUp(){
        product = mock(Product.class);
    }

    @Test
    public void buyThreeItemsTest() {
        //given
        int amount = 3;
        Double totalValueOfPurchase = 4.5;
        //when
        when(product.buySomething(amount)).thenReturn(totalValueOfPurchase);
        //then
        assertThat(product.buySomething(amount)).isEqualTo(totalValueOfPurchase);
    }

    @Test
    public void addFourProductsToCartTest() {
        //given
        for (int i = 0; i < 4; i++) {
            product.addToCart(new Product());
        }
        //when-then
        verify(product, times(4)).addToCart(any());
    }

}