package be.juvo.introductionarycourse.MockitoAndLombok.lombok;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LombokBeanTest {

    @Test
    void testToString() {
        //given
        LombokBean lombokBean = new LombokBean("Snickers", 1322132155, 1.1);
        RegularJavaBean regularJavaBean = new RegularJavaBean("Snickers", 1322132155, 1.1);
        //when
        String expected = "LombokBean(" +
                            "productName=" + lombokBean.getProductName() +
                            ", productCode=" + lombokBean.getProductCode() +
                            ", productPrice=" + lombokBean.getProductPrice() +
                            ')';
        //then
        assertThat(expected).isEqualTo(lombokBean.toString());
        //print result
        System.out.println("LombokBean: \t \t  " + lombokBean.toString());
        System.out.println("RegularJavaBean: " + regularJavaBean.toString());
    }
}