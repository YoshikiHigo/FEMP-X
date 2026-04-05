package unverified;

public class ClonePair8366 {

    double method1(double[] array,int size){
      double min=array[0];
      for (int i=0; i < size; i++)   if (array[i] < min)   min=array[i];
      return min;
    }

    double method2(double[] raw,int count){
      double max=raw[0];
      int i=0;
      for (; i < count; i++)   if (raw[i] > max)   max=raw[i];
      return max;
    }
}
