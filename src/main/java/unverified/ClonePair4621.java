package unverified;

public class ClonePair4621 {

    double method1(double[] a){
      double b=a[0];
      for (int i=0; i < a.length; i++)   if (a[i] > b)   b=a[i];
      return b;
    }

    double method2(double[] data){
      double answer=data[0];
      for (int i=1; i < data.length; i++) {
        double alt=data[i];
        if (alt > answer) {
          answer=alt;
        }
      }
      return answer;
    }
}
