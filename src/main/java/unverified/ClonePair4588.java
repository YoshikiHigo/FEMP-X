package unverified;

public class ClonePair4588 {

    double method1(double[] arrFunc){
      double dblMin=arrFunc[0];
      for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] < dblMin) {
        dblMin=arrFunc[index];
      }
      return dblMin;
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
