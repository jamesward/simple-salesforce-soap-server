// ParksImpl.java
package services.parks;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(endpointInterface = "services.parks.Parks")
@BindingType(value=SOAPBinding.SOAP11HTTP_BINDING)
public class ParksImpl implements Parks {

    @Override
    public String[] byCountry(String countryName) {
        String[] parks = new String[3];

        switch (countryName) {
          case "United States":
            parks[0] = "Yellowstone";
            parks[1] = "Mackinac National Park";
            parks[2] = "Yosemite";
            break;
          case "Germany":
            parks[0] = "Hamburg Wadden Sea National Park";
            parks[1] = "Hainich National Park";
            parks[2] = "Bavarian Forest National Park";
            break;
          case "India":
            parks[0] = "Anamudi Shola National Park";
            parks[1] = "Anshi National Park";
            parks[2] = "Bandipur National Park";
            break;
          case "Japan":
            parks[0] = "Shiretoko National Park";
            parks[1] = "Oze National Park";
            parks[2] = "Hakusan National Park";
            break;
          case "Salesforce":
            parks[0] = "Trailhead";
            parks[1] = "is";
            parks[2] = "awesome!";
            break;
          default:
            parks[0] = "No";
            parks[1] = "matching";
            parks[2] = "country";
        }

        return parks;
    }
}
