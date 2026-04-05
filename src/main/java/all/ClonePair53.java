package all;

public class ClonePair53 {

    Number method1(Number... args){
      Number res=args[0];
      for (int i=1; i < args.length; i++) {
        if ((res instanceof Long) && (args[i] instanceof Long))     res=Long.valueOf(res.longValue() + args[i].longValue());
     else     res=Double.valueOf(res.doubleValue() + args[i].doubleValue());
      }
      return res;
    }

    Number method2(Number... args){
      Number res=args[0];
      for (int i=1; i < args.length; i++) {
        if ((res instanceof Long) && (args[i] instanceof Long))     res=Long.valueOf(Math.max(res.longValue(),args[i].longValue()));
     else     res=Double.valueOf(Math.max(res.doubleValue(),args[i].doubleValue()));
      }
      return res;
    }
}
