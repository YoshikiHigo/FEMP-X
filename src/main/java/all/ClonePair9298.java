package all;

import java.util.*;

public class ClonePair9298 {

    String[] method1(Collection collection){
      String[] retur=new String[collection.size()];
      Iterator it=collection.iterator();
      int k=0;
      for (int i=0; i < collection.size(); i++) {
        retur[i]=(String)it.next();
      }
      for (int i=0; i < retur.length - 1; i++) {
        if (retur[i].compareTo(retur[i + 1]) > 0) {
          String temp=retur[i];
          retur[i]=retur[i + 1];
          retur[i + 1]=temp;
          int j=i;
          boolean done=false;
          while (j != 0 && !done) {
            if (retur[j].compareTo(retur[j - 1]) < 0) {
              temp=retur[j];
              retur[j]=retur[j - 1];
              retur[j - 1]=temp;
            }
     else         done=true;
            j--;
          }
        }
      }
      return retur;
    }

    String[] method2(Collection c){
      Iterator iter=c.iterator();
      String s=null;
      String[] ret=new String[c.size()];
      int i=0;
      while (iter.hasNext()) {
        s=(String)iter.next();
        ret[i]=s;
        i++;
      }
      return ret;
    }
}
