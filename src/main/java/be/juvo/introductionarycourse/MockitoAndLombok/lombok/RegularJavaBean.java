package be.juvo.introductionarycourse.MockitoAndLombok.lombok;

import java.util.Objects;

public class RegularJavaBean {

    private String productName;
    private Integer productCode;
    private Double productPrice;

    public RegularJavaBean(String productName, Integer productCode, Double productPrice) {
        this.productName = productName;
        this.productCode = productCode;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegularJavaBean that = (RegularJavaBean) o;
        return Objects.equals(getProductName(), that.getProductName()) &&
                Objects.equals(getProductCode(), that.getProductCode()) &&
                Objects.equals(getProductPrice(), that.getProductPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getProductCode(), getProductPrice());
    }

    @Override
    public String toString() {
        return "RegularJavaBean{" +
                "productName='" + productName + '\'' +
                ", productCode=" + productCode +
                ", productPrice=" + productPrice +
                '}';
    }
}
