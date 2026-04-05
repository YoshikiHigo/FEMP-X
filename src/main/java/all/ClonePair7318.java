package all;

import java.util.*;

public class ClonePair7318 {

    double method1(Vector samples){
      double mean=0;
      for (Iterator itr=samples.iterator(); itr.hasNext(); ) {
        double sample=((Double)itr.next()).doubleValue();
        mean+=sample;
      }
      mean/=(double)samples.size();
      return mean;
    }

    double method2(Vector values){
      double total=0;
      for (int i=0; i < values.size(); i++) {
        total+=((Double)values.elementAt(i)).doubleValue();
      }
      return (total / values.size());
    }
}
