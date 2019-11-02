package be.juvo.introductionarycourse.MockitoAndLombok.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LombokBean {

    private String productName;
    private Integer productCode;
    private Double productPrice;
}
