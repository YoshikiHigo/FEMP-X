package unverified;

public class ClonePair8858 {

    int method1(int... args){
      int result=args[0];
      for (int i=1; i < args.length; i++)   if (args[i] > result)   result=args[i];
      return result;
    }

    int method2(int... xs){
      int max=xs[0];
      for (int i=1; i < xs.length; ++i)   if (xs[i] > max)   max=xs[i];
      return max;
    }
}
