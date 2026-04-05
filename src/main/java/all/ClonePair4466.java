package all;

public class ClonePair4466 {

    double method1(double[] values){
      double total=0;
      int size=values.length;
      int count=0;
      for (int x=0; x < size; x++) {
        if (values[x] != 0) {
          total+=values[x];
          count++;
        }
      }
      return total / count;
    }

    double method2(double[] arry){
      int cnt=0;
      double mean=0.0f;
      for (int i=0; i < arry.length; i++) {
        if (arry[i] != 0) {
          mean+=arry[i];
          ++cnt;
        }
      }
      mean/=(cnt);
      return mean;
    }
}
