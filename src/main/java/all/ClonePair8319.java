package all;

public class ClonePair8319 {

    int method1(int data[]){
      int max=data[0];
      for (int i=0; i < data.length; i++) {
        if (data[i] > max)     max=data[i];
      }
      return max;
    }

    int method2(int... values){
      int value=values[0];
      int len=values.length;
      for (int i=0; i < len; i++) {
        if (values[i] >= value)     value=values[i];
      }
      return value;
    }
}
