package unverified;

public class ClonePair3838 {

    double method1(double[] a,double[] b){
      double total=0.0;
      for (int i=0; i < a.length; i++) {
        total+=(a[i] * b[i]);
      }
      return total;
    }

    double method2(double[] vec1,double[] vec2){
      int n=vec1.length;
      double res=0.0;
      for (int i=0; i < n; ++i)   res+=vec1[i] * vec2[i];
      return (res);
    }
}
