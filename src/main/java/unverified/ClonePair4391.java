package unverified;

import java.util.Date;

public class ClonePair4391 {

    boolean method1(Date data1,Date data2){
      if (data1 == null && data2 == null)   return true;
      if ((data1 != null && data2 == null) || (data1 == null && data2 != null))   return false;
      return (data1.compareTo(data2) == 0);
    }

    boolean method2(Date a,Date b){
      if (a == null && b == null)   return true;
      if (a == null || b == null)   return false;
      return ((long)a.getTime() / 60000l) == ((long)b.getTime() / 60000l);
    }
}
