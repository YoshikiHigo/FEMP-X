package all;

import java.util.*;

public class ClonePair9005 {

    int method1(Enumeration famList,Hashtable parentgeno,Hashtable kidgeno){
      int tdtfams=0;
      while (famList.hasMoreElements()) {
        int parentGeno=0, kidsGeno=0;
        String key=(String)famList.nextElement();
        Integer pGeno=(Integer)parentgeno.get(key);
        Integer kGeno=(Integer)kidgeno.get(key);
        if (pGeno != null) {
          parentGeno=pGeno.intValue();
        }
        if (kGeno != null) {
          kidsGeno=kGeno.intValue();
        }
        if (parentGeno >= 2 && kidsGeno >= 1) {
          if (parentGeno / 2 > kidsGeno) {
            tdtfams+=kidsGeno;
          }
     else {
            tdtfams+=parentGeno / 2;
          }
        }
      }
      return tdtfams;
    }

    int method2(Enumeration famList,Hashtable parentgeno,Hashtable kidgeno){
      int tdtfams=0;
      while (famList.hasMoreElements()) {
        int parentGeno=0, kidsGeno=0;
        String key=(String)famList.nextElement();
        Integer pGeno=(Integer)parentgeno.get(key);
        Integer kGeno=(Integer)kidgeno.get(key);
        if (pGeno != null)     parentGeno=pGeno.intValue();
        if (kGeno != null)     kidsGeno=kGeno.intValue();
        if (parentGeno >= 2 && kidsGeno >= 1) {
          if (parentGeno / 2 > kidsGeno) {
            tdtfams+=kidsGeno;
          }
     else {
            tdtfams+=parentGeno / 2;
          }
        }
      }
      return tdtfams;
    }
}
