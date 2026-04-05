package all;

public class ClonePair8136 {

    long method1(long[] array){
      long min=array[0];
      for (int i=1; i < array.length; i++)   if (array[i] < min)   min=array[i];
      return min;
    }

    long method2(long[] values){
      long min=values[0];
      for (  long l : values) {
        if (l < min) {
          min=l;
        }
      }
      return min;
    }
}
