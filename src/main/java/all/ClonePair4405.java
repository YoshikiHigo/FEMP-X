package all;

import java.util.Vector;

public class ClonePair4405 {

    double method1(Vector<Double> vec){
      double mean=0;
      int counter=0;
      for (int i=0; i < vec.size(); i++) {
        if (!Double.isNaN(vec.get(i))) {
          mean+=vec.get(i);
          counter++;
        }
      }
      if (counter == 0) {
        return Double.NaN;
      }
      mean/=(counter);
      return mean;
    }

    double method2(Vector<Double> standards){
      double mean=0;
      for (int j=0; j < standards.size(); j++) {
        mean+=standards.elementAt(j);
      }
      return mean / standards.size();
    }
}
