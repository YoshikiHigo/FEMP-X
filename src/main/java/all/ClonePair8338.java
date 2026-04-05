package all;

public class ClonePair8338 {

    double method1(double[] v,int e){
      double total=0;
      for (int i=0; i < e; i++) {
        total+=v[i];
      }
      return total / e;
    }

    double method2(double[] d,int numParam){
      double sum=0;
      for (int i=0; i < numParam; i++)   sum+=d[i];
      return sum / numParam;
    }
}
