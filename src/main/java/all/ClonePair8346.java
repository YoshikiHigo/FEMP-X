package all;

public class ClonePair8346 {

    double method1(double[] array,int size){
      double max=array[0];
      for (int i=0; i < size; i++)   if (max < array[i])   max=array[i];
      return max;
    }

    double method2(double[] array,int size){
      double min=array[0];
      for (int i=0; i < size; i++)   if (array[i] < min)   min=array[i];
      return min;
    }
}
