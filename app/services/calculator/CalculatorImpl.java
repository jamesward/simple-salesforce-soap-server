// CalculatorImpl.java
package services.calculator;

import javax.jws.WebService;

@WebService(endpointInterface = "services.calculator.Calculator")
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP11HTTP_BINDING)
public class CalculatorImpl implements Calculator {

    @Override
    public Double doAdd(Double x, Double y) {
        return x+y;
    }

    @Override
    public Double doSubtract(Double x, Double y) {
        return x-y;
    }

    @Override
    public Double doMultiply(Double x, Double y) {
        return x*y;
    }

    @Override
    public Double doDivide(Double numerator, Double denominator) {
        return numerator/denominator;
    }
}
