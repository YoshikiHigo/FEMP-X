package all;

public class ClonePair4792 {

    double method1(double[] data){
      double max=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
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
