package all;

public class ClonePair8347 {

    double method1(double[] array,int size){
      double max=array[0];
      for (int i=0; i < size; i++)   if (max < array[i])   max=array[i];
      return max;
    }

    double method2(double[] raw,int count){
      double max=raw[0];
      int i=0;
      for (; i < count; i++)   if (raw[i] > max)   max=raw[i];
      return max;
    }
}
