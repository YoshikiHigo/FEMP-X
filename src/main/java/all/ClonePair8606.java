package all;

import java.util.*;

public class ClonePair8606 {

    boolean method1(String a,String b){
      String[] partsA=a.split(", *");
      Arrays.sort(partsA);
      String[] partsB=b.split(", *");
      Arrays.sort(partsB);
      if (partsA.length != partsB.length) {
        return false;
      }
      for (int i=0; i < partsA.length; i++) {
        if (!partsA[i].equals(partsB[i])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(String s1,String s2){
      if (s1.length() != s2.length())   return false;
      int result=0;
      for (int i=0; i < s1.length(); i++) {
        int c1=s1.charAt(i);
        int c2=s2.charAt(i);
        result|=(c1 ^ c2);
      }
      return result == 0;
    }
}
