// Add.java
package services.calculator;

import javax.jws.WebService;

@WebService
public interface Add {
    Double doAdd(Double x, Double y);
}
