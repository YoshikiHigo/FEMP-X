package all;

public class ClonePair8007 {

    boolean method1(Class[] c,Object[] args){
      if (c.length != args.length) {
        return false;
      }
      for (int i=0; i < c.length; i++) {
        if (!c[i].isInstance(args[i])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(Class[] paramTypes,Object[] args){
      if (paramTypes.length != args.length)   return false;
      for (int i=0; i < args.length; i++) {
        if (!paramTypes[i].isInstance(args[i]))     return false;
      }
      return true;
    }
}
