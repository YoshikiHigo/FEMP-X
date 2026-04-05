package all;

public class ClonePair8009 {

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

    boolean method2(Class[] c,Object[] o){
      int n, len;
      if (c.length != o.length) {
        return false;
      }
      len=c.length;
      for (n=0; n < len; n++) {
        if (!c[n].isInstance(o[n]) && !(c[n].equals(Integer.TYPE) && o[n] instanceof Integer) && !(c[n].equals(Double.TYPE) && o[n] instanceof Double)) {
          return false;
        }
      }
      return true;
    }
}
