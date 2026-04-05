package unverified;

import java.util.*;

public class ClonePair8599 {

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

    boolean method2(String string1,String string2){
      boolean stringsAreEqual=false;
      if (string1.length() == string2.length()) {
        int stringLength=string1.length();
        int pos;
        for (pos=0; pos < stringLength; ++pos) {
          if (Character.toUpperCase(string1.charAt(pos)) != Character.toUpperCase(string2.charAt(pos))) {
            break;
          }
        }
        if (pos == stringLength) {
          stringsAreEqual=true;
        }
      }
      return stringsAreEqual;
    }
}
