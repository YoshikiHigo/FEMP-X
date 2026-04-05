package all;

public class ClonePair8355 {

    double method1(double[] d,int numParam){
      double sum=0;
      for (int i=0; i < numParam; i++)   sum+=d[i];
      return sum;
    }

    double method2(double[] values,int numValues){
      double total=0;
      for (int i=0; i < numValues; ++i)   total+=values[i];
      return total;
    }
}
