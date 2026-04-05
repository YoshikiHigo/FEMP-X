package all;

public class ClonePair8010 {

    boolean method1(Class[] paramTypes,Object[] args){
      if (paramTypes.length != args.length)   return false;
      for (int i=0; i < args.length; i++) {
        if (!paramTypes[i].isInstance(args[i]))     return false;
      }
      return true;
    }

    boolean method2(Class[] c,Object[] args){
      if (c.length != args.length) {
        return false;
      }
      if (c.length == 0)   return true;
      for (int i=0; i < args.length; i++) {
        if (!c[i].isInstance(args[i])) {
          return false;
        }
      }
      return true;
    }
}
