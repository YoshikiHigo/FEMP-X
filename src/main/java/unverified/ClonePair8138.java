package unverified;

public class ClonePair8138 {

    long method1(long[] values){
      long max=values[0];
      for (  long l : values) {
        if (l > max) {
          max=l;
        }
      }
      return max;
    }

    long method2(long[] values){
      long highest=values[0];
      for (int i=1; i < values.length; i++)   if (values[i] > highest)   highest=values[i];
      return highest;
    }
}
