package all;

public class ClonePair8367 {

    double method1(double[] values,int numValues){
      double total=0;
      for (int i=0; i < numValues; ++i)   total+=values[i];
      return total;
    }

    double method2(double[] items,int length){
      double ret=0;
      for (int i=0; i < length; i++) {
        ret+=items[i];
      }
      return ret;
    }
}
