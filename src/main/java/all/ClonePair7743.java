package all;

import java.util.*;

public class ClonePair7743 {

    boolean method1(Object value_frm,Object value_db){
      if (value_frm == value_db)   return true;
      if (value_frm == null)   return false;
      if ((value_frm instanceof Date) && (value_db instanceof Date)) {
        Date d1=(Date)value_frm;
        Date d2=(Date)value_db;
        return (d1.getTime() / 1000) == (d2.getTime() / 1000);
      }
      return value_frm.equals(value_db);
    }

    boolean method2(Object n1,Object n2){
      if (n1 == null || n2 == null)   return false;
      if (!(n1 instanceof Number && n2 instanceof Number)) {
        return n1.equals(n2);
      }
      return ((Number)n1).floatValue() == ((Number)n2).floatValue();
    }
}
