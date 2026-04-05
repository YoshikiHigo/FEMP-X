package all;

public class ClonePair8863 {

    int method1(int... args){
      int result=args[0];
      for (int i=1; i < args.length; i++)   if (args[i] > result)   result=args[i];
      return result;
    }

    int method2(int... array){
      int max=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] > max) {
          max=array[i];
        }
      }
      return max;
    }
}
