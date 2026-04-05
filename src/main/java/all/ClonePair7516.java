package all;

import java.util.*;

public class ClonePair7516 {

    boolean method1(Object obj1,Object obj2){
      if ((obj1 == null && obj2 != null) || (obj2 == null && obj1 != null))   return false;
      if (obj1 == null && obj2 == null)   return true;
      if (obj1.equals(obj2))   return true;
     else   return false;
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
