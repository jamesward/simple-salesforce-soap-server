// AddImpl.java
package services.calculator;

import javax.jws.WebService;

@WebService(endpointInterface = "services.calculator.Add")
public class AddImpl implements Add {

    @Override
    public Double doAdd(Double x, Double y) {
        return x+y;
    }
}
