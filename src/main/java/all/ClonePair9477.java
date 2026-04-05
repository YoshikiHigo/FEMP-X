package all;

import java.util.*;

public class ClonePair9477 {

    String method1(Calendar inDate){
      StringBuffer ret=new StringBuffer(8);
      ret.append(inDate.get(Calendar.YEAR));
      if (inDate.get(Calendar.MONTH) + 1 < 10)   ret.append('0');
      ret.append((inDate.get(Calendar.MONTH) + 1));
      if (inDate.get(Calendar.DAY_OF_MONTH) < 10)   ret.append('0');
      ret.append(inDate.get(Calendar.DAY_OF_MONTH));
      return ret.toString();
    }

    String method2(Calendar inDate){
      StringBuffer ret=new StringBuffer(8);
      ret.append(inDate.get(Calendar.YEAR));
      if (inDate.get(Calendar.MONTH) + 1 < 10) {
        ret.append('0');
      }
      ret.append((inDate.get(Calendar.MONTH) + 1));
      if (inDate.get(Calendar.DAY_OF_MONTH) < 10) {
        ret.append('0');
      }
      ret.append(inDate.get(Calendar.DAY_OF_MONTH));
      return ret.toString();
    }
}
