package all;

import java.util.*;

public class ClonePair6239 {

    boolean method1(String a,String b){
      if (a == b) {
        return true;
      }
      int n=a.length();
      if (n == b.length()) {
        while (--n >= 0) {
          if (a.charAt(n) != b.charAt(n))       return false;
        }
        return true;
      }
      return false;
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
