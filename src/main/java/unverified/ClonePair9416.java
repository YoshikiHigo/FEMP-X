package unverified;

public class ClonePair9416 {

    int method1(int[] values){
      int result=values[0];
      for (  int i : values)   if (i > result)   result=i;
      return result;
    }

    int method2(int[] qianArray){
      int max=qianArray[0];
      for (int i=1; i < qianArray.length; i++) {
        if (max < qianArray[i]) {
          max=qianArray[i];
        }
      }
      return max;
    }
}
