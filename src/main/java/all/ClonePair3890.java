package all;

public class ClonePair3890 {

    double method1(double[] value1,double[] value2){
      double sum=0.0;
      for (int i=0; i < value1.length; i++) {
        double v1=value1[i];
        double v2=value2[i];
        if ((!Double.isNaN(v1)) && (!Double.isNaN(v2))) {
          sum=sum + v2 * v1;
        }
      }
      return sum;
    }

    double method2(double[] vec1,double[] vec2){
      int n=vec1.length;
      double res=0.0;
      for (int i=0; i < n; ++i)   res+=vec1[i] * vec2[i];
      return (res);
    }
}
