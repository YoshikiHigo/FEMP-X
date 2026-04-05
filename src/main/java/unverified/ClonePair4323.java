package unverified;

import java.util.Date;

public class ClonePair4323 {

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

    boolean method2(Date data1,Date data2){
      if (data1 == null && data2 == null)   return true;
      if ((data1 != null && data2 == null) || (data1 == null && data2 != null))   return false;
      return (data1.compareTo(data2) == 0);
    }
}
