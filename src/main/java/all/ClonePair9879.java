package all;

public class ClonePair9879 {

    int method1(int data[]){
      int min=data[0];
      for (int i=0; i < data.length; i++) {
        if (data[i] < min)     min=data[i];
      }
      return min;
    }

    int method2(int... values){
      int value=values[0];
      int len=values.length;
      for (int i=0; i < len; i++) {
        if (values[i] <= value)     value=values[i];
      }
      return value;
    }
}
