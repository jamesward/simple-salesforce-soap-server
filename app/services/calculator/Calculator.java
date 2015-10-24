// Calculator.java
package services.calculator;

import javax.jws.WebService;

@WebService
public interface Calculator {
    Double doAdd(Double x, Double y);
    Double doSubtract(Double x, Double y);
    Double doMultiply(Double x, Double y);
    Double doDivide(Double numerator, Double denominator);
}
