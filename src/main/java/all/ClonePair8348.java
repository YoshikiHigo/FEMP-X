package all;

public class ClonePair8348 {

    double method1(double[] array,int size){
      double max=array[0];
      for (int i=0; i < size; i++)   if (max < array[i])   max=array[i];
      return max;
    }

    double method2(double[] raw,int count){
      double min=raw[0];
      int i=0;
      for (; i < count; i++)   if (raw[i] < min)   min=raw[i];
      return min;
    }
}
