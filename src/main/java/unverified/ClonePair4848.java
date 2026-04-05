package unverified;

public class ClonePair4848 {

    double method1(double[] array){
      double max=array[0];
      for (  double d : array)   if (d > max)   max=d;
      return max;
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
