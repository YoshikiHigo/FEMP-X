package all;

public class ClonePair6096 {

    boolean method1(Object[] o,Object[] p){
      if (o.length != p.length) {
        return false;
      }
      for (int i=0; i < o.length; i++) {
        if (!(o[i].equals(p[i]))) {
          return false;
        }
      }
      return true;
    }

    boolean method2(Object[] orig,Object[] rev){
      if (orig.length != rev.length) {
        return false;
      }
     else {
        for (int i=0; i < orig.length; i++) {
          if (!orig[i].equals(rev[i])) {
            return false;
          }
        }
        return true;
      }
    }
}
