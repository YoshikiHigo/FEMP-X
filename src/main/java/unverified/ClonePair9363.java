package unverified;

public class ClonePair9363 {

    int method1(int[] sn){
      int result=sn[0];
      for (int i=0; i < sn.length; i++) {
        if (result < sn[i])     result=sn[i];
      }
      return result;
    }

    int method2(int[] numbers){
      int max=numbers[0];
      for (int i=1; i < numbers.length; ++i)   if (numbers[i] > max)   max=numbers[i];
      return max;
    }
}
