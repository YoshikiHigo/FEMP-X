package all;

public class ClonePair4627 {

    double method1(double[] data){
      double answer=data[0];
      for (int i=1; i < data.length; i++) {
        double alt=data[i];
        if (alt < answer) {
          answer=alt;
        }
      }
      return answer;
    }

    double method2(double[] array){
      double min=array[0];
      for (  double d : array)   if (d < min)   min=d;
      return min;
    }
}
