package unverified;

import java.util.*;

public class ClonePair8604 {

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
      if (string2.length() != string1.length())   return (false);
      for (int i=0; i < string2.length(); i++) {
        if (Character.toLowerCase(string1.charAt(i)) != Character.toLowerCase(string2.charAt(i)))     return (false);
      }
      return (true);
    }
}
