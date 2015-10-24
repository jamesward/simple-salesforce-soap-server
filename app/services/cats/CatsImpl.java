// CatsImpl.java
package services.cats;

import javax.jws.WebService;
import java.util.Random;

@WebService(endpointInterface = "services.cats.Cats")
public class CatsImpl implements Cats {

    @Override
    public String randomFact() {

        String[] facts = new String[]{
          "The first true cats came into existence about 12 million years ago and were the Proailurus.",
          "Unlike other cats, lions have a tuft of hair at the end of their tails.",
          "A cat's brain is more similar to a man's brain than that of a dog.",
          "The cat's front paw has 5 toes, but the back paws have 4. Some cats are born with as many as 7 front toes and extra back toes (polydactl).",
          "A cat has more bones than a human being; humans have 206 and the cat has 230 bones.",
          "A cat will spend nearly 30% of her life grooming herself.",
          "The mountain lion and the cheetah share an ancestor.",
          "A cat's appetite is the barometer of its health. Any cat that does not eat or drink for more than two days should be taken to a vet."
        };

        int rnd = new Random().nextInt(facts.length);
        return facts[rnd];
    }

}
