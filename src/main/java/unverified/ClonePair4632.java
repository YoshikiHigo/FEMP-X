package unverified;

public class ClonePair4632 {

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
      for (int i=1; i < array.length; i++) {
        if (array[i] < min)     min=array[i];
      }
      return min;
    }
}
