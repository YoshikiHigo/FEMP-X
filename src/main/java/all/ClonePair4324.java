package all;

import java.util.Date;

public class ClonePair4324 {

    boolean method1(Date source,Date target){
      boolean isEqual;
      if ((source == null && target != null) || (source != null && target == null) || (source != null && target != null && !source.equals(target))) {
        isEqual=false;
      }
     else {
        isEqual=true;
      }
      return isEqual;
    }

    boolean method2(Date a,Date b){
      if (a == null && b == null)   return true;
      if (a == null || b == null)   return false;
      return ((long)a.getTime() / 60000l) == ((long)b.getTime() / 60000l);
    }
}
