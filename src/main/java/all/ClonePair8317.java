package all;

public class ClonePair8317 {

    int method1(int data[]){
      int max=data[0];
      for (int i=0; i < data.length; i++) {
        if (data[i] > max)     max=data[i];
      }
      return max;
    }

    int method2(int... array){
      int max=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] > max) {
          max=array[i];
        }
      }
      return max;
    }
}
