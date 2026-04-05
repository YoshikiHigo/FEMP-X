package all;

import java.util.*;

public class ClonePair7599 {

    boolean method1(Object t1,Object t2){
      if (t1 instanceof Number && t2 instanceof Number) {
        return ((Number)t1).doubleValue() == ((Number)t2).doubleValue();
      }
     else {
        if (t1 == null || t2 == null) {
          return false;
        }
        return t1.equals(t2);
      }
    }

    boolean method2(Object value_frm,Object value_db){
      if (value_frm == value_db)   return true;
      if (value_frm == null)   return false;
      if ((value_frm instanceof Date) && (value_db instanceof Date)) {
        Date d1=(Date)value_frm;
        Date d2=(Date)value_db;
        return (d1.getTime() / 1000) == (d2.getTime() / 1000);
      }
      return value_frm.equals(value_db);
    }
}
