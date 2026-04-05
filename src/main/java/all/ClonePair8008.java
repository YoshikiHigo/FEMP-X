package all;

public class ClonePair8008 {

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
