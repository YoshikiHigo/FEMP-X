package all;

import java.util.Arrays;

public class ClonePair4463 {

    double method1(double[] polje){
      if (polje.length == 0)   return 0;
      double umnozak=1;
      for (int i=0; i < polje.length; i++) {
        umnozak*=polje[i];
      }
      return Math.pow(umnozak,1.0 / polje.length);
    }

    double method2(double[] values){
      if (values.length == 0) {
        return 0.0d;
      }
     else {
        double[] val=Arrays.copyOf(values,values.length);
        Arrays.sort(val);
        return val[val.length - 1];
      }
    }
}
