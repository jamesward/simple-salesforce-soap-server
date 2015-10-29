// Parks.java
package services.parks;

import javax.jws.WebService;

@WebService
public interface Parks {
    String[] byCountry(String name);
}
