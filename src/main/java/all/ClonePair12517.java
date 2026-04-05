package all;

import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class ClonePair12517 {

    TimeZone method1(Object o){
      if (o == null) {
        return null;
      }
      if (o instanceof TimeZone) {
        return (TimeZone)o;
      }
      TimeZone result=null;
      if (o instanceof Integer) {
        int rawOffset=((Integer)o).intValue();
        String ids[]=TimeZone.getAvailableIDs(rawOffset);
        String id=(ids != null && 0 < ids.length) ? ids[0] : "";
        o=new SimpleTimeZone(rawOffset,id);
      }
      return result;
    }

    TimeZone method2(Object o){
      if (o == null)   return null;
      if (o instanceof TimeZone)   return (TimeZone)o;
      TimeZone result=null;
      if (o instanceof Integer) {
        int rawOffset=((Integer)o).intValue();
        String ids[]=TimeZone.getAvailableIDs(rawOffset);
        String id=(ids != null && 0 < ids.length) ? ids[0] : "";
        o=new SimpleTimeZone(rawOffset,id);
      }
      return result;
    }
}
