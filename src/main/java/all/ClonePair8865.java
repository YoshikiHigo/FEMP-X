package all;

public class ClonePair8865 {

    int method1(int... args){
      int result=args[0];
      for (int i=1; i < args.length; i++)   if (args[i] > result)   result=args[i];
      return result;
    }

    int method2(int... values){
      int value=values[0];
      int len=values.length;
      for (int i=0; i < len; i++) {
        if (values[i] >= value)     value=values[i];
      }
      return value;
    }
}
