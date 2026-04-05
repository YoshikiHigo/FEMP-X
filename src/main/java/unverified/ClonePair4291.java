package unverified;

import java.util.StringTokenizer;

public class ClonePair4291 {

    boolean method1(String readA,String readB){
      if ((readA.trim().length() <= 0) || (readB.trim().length() <= 0))   return false;
      String strA=readA.substring(0,readA.length() - 1);
      String strB=readB.substring(0,readB.length() - 1);
      if (strA.equals(strB)) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(String list0,String list1){
      if (list0.length() == 0 || list1.length() == 0)   return false;
      StringTokenizer stk0=new StringTokenizer(list0.toUpperCase(),",");
      int nId0=stk0.countTokens();
      StringTokenizer stk1=new StringTokenizer(list1.toUpperCase(),",");
      int nId1=stk1.countTokens();
      String idList0[]=new String[nId0];
      for (int i=0; i < nId0; i++) {
        idList0[i]=stk0.nextToken();
      }
      String idList1[]=new String[nId1];
      for (int i=0; i < nId1; i++) {
        idList1[i]=stk1.nextToken();
      }
      for (int i0=0; i0 < nId0; i0++) {
        for (int i1=0; i1 < nId1; i1++) {
          if (idList0[i0].equals(idList1[i1]))       return true;
        }
      }
      return false;
    }
}
