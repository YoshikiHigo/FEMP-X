package all;

import java.util.*;

public class ClonePair6612 {

    String method1(HashMap aHMTranslator,String aStatus){
      String status="";
      if ((aStatus != null) && (!"".equals(aStatus)) && (!"unknown".equalsIgnoreCase(aStatus))) {
        String literal;
        if (aStatus.equals("not attempted")) {
          literal="tracking.content.table2.attempted";
        }
     else {
          literal="tracking.content.table2." + aStatus;
        }
        status=(String)aHMTranslator.get(literal);
      }
      return status;
    }

    String method2(HashMap aHMTranslator,String aStatus){
      String status="";
      if ((aStatus != null) && !"".equals(aStatus) && (!"unknown".equalsIgnoreCase(aStatus))) {
        String literal;
        if (aStatus.equals("not attempted")) {
          literal="tracking.content.table2.attempted";
        }
     else {
          literal="tracking.content.table2." + aStatus;
        }
        status=(String)aHMTranslator.get(literal);
      }
      return status;
    }
}
