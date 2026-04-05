package all;

import java.util.*;

public class ClonePair4953 {

    String method1(Hashtable table){
      String tisch=null;
      Enumeration en=table.keys();
      while (en.hasMoreElements()) {
        tisch=(String)en.nextElement();
      }
      return tisch;
    }

    String method2(Hashtable t){
      Enumeration e=t.keys();
      String alias=null;
      while (e.hasMoreElements()) {
        alias=(String)e.nextElement();
      }
      return alias;
    }
}
