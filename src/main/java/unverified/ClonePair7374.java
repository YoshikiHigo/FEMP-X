package unverified;

import java.util.*;

public class ClonePair7374 {

    boolean method1(String sub,String s){
      if (sub.length() != s.length())   return false;
      char[] csub=sub.toCharArray();
      char[] c=s.toCharArray();
      for (int i=0; i < csub.length; i++) {
        if (csub[i] != '0' && c[i] == '0')     return false;
      }
      return true;
    }

    boolean method2(String a,String b){
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
}
