package unverified;

import java.util.StringTokenizer;

public class ClonePair4343 {

    boolean method1(String s1,String s2){
      int l1=s1.length();
      int l2=s2.length();
      if (l1 == 0 || l2 == 0 || l1 < l2)   return false;
      return s1.regionMatches(l1 - l2,s2,0,l2);
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
