package unverified;

import java.util.*;

public class ClonePair8594 {

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

    boolean method2(String enc1,String enc2){
      enc1=enc1.toLowerCase();
      enc2=enc2.toLowerCase();
      if (enc1.endsWith("be") || enc1.endsWith("le")) {
        enc1=enc1.substring(0,enc1.length() - 2);
      }
      if (enc2.endsWith("be") || enc2.endsWith("le")) {
        enc2=enc2.substring(0,enc2.length() - 2);
      }
      return enc1.equals(enc2);
    }
}
