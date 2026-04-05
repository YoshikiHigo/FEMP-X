package all;

public class ClonePair4604 {

    double method1(double[] values){
      double min=values[0];
      for (int f=0; f < values.length; f++)   if (values[f] < min)   min=values[f];
      return min;
    }

    double method2(double[] data){
      double answer=data[0];
      for (int i=1; i < data.length; i++) {
        double alt=data[i];
        if (alt < answer) {
          answer=alt;
        }
      }
      return answer;
    }
}
