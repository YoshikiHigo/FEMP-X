package unverified;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class ClonePair4014 {

    boolean method1(String src,String mask){
      boolean res=true;
      int pos=0;
      boolean first=true;
      if (mask.indexOf('*') >= 0) {
        StringTokenizer st=new StringTokenizer(mask,"*");
        while (st.hasMoreTokens()) {
          String m=st.nextToken();
          int mlen=m.length();
          if (mlen > 0) {
            if ((pos + mlen) < src.length()) {
              int npos=src.indexOf(m,pos);
              if (npos >= 0) {
                if (first && mask.charAt(0) != '*') {
                  if (npos != 0) {
                    npos=-1;
                  }
                }
     else             if (!st.hasMoreTokens() && mask.charAt(mask.length() - 1) != '*') {
                  if ((npos + mlen) < src.length()) {
                    npos=-1;
                  }
                }
              }
              if (npos >= 0) {
                pos=npos + mlen;
              }
     else {
                res=false;
                pos=src.length();
              }
            }
     else {
              res=false;
              pos=src.length();
            }
          }
          first=false;
        }
      }
     else {
        res=src.compareTo(mask) == 0;
      }
      return res;
    }

    boolean method2(String pName1,String pName2){
      String[] name1TokensArray=pName1.split(" ");
      String[] name2TokensArray=pName2.split(" ");
      Set<String> name1Set=new HashSet<String>();
      for (int i=0; i < name1TokensArray.length; i++) {
        name1Set.add(name1TokensArray[i]);
      }
      Set<String> name2Set=new HashSet<String>();
      for (int i=0; i < name2TokensArray.length; i++) {
        name2Set.add(name2TokensArray[i]);
      }
      int name1SetSize=name1Set.size();
      int name2SetSize=name2Set.size();
      if (Math.abs(name1SetSize - name2SetSize) > 1) {
        return false;
      }
      Set<String> nameASet=name1Set;
      Set<String> nameBSet=name2Set;
      if (name1SetSize > name2SetSize) {
        nameASet=name2Set;
        nameBSet=name1Set;
      }
      if (nameASet.containsAll(nameBSet)) {
        return true;
      }
      return false;
    }
}
