package all;

import java.util.*;

public class ClonePair7567 {

    boolean method1(Object thisObject,Object thatObject){
      if (thisObject == null) {
        return thatObject == null;
      }
     else   if (thatObject == null) {
        return false;
      }
     else   if (thisObject.equals(thatObject) == false) {
        return false;
      }
      return true;
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
