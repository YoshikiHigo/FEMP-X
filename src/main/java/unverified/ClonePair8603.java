package unverified;

import java.util.*;

public class ClonePair8603 {

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

    boolean method2(String a,String b){
      if (a == b) {
        return true;
      }
      if (a.length() != b.length())   return false;
      int n=a.length();
      if (n == b.length()) {
        for (int i=n - 1; i >= 0; i--) {
          if (a.charAt(i) != b.charAt(i)) {
            return false;
          }
        }
      }
      return true;
    }
}
