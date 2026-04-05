package unverified;

public class ClonePair9325 {

    int method1(int[] values){
      int largestvalue=values[0];
      for (int i=1; i < values.length; i++)   if (values[i] > largestvalue)   largestvalue=values[i];
      return largestvalue;
    }

    int method2(int[] values){
      int result=values[0];
      for (  int i : values)   if (i > result)   result=i;
      return result;
    }
}
