package all;

public class ClonePair8357 {

    double method1(double[] d,int numParam){
      double sum=0;
      for (int i=0; i < numParam; i++)   sum+=d[i];
      return sum;
    }

    double method2(double[] items,int length){
      double ret=0;
      for (int i=0; i < length; i++) {
        ret+=items[i];
      }
      return ret;
    }
}
