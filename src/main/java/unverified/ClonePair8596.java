package unverified;

import java.util.*;

public class ClonePair8596 {

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

    boolean method2(String beanName,String elementName){
      int beanNameLen=beanName.length();
      int elementNameLen=elementName.length();
      int elementPos=0;
      int beanPos=0;
      while ((elementPos < elementNameLen) && (beanPos < beanNameLen)) {
        char beanCh=Character.toLowerCase(beanName.charAt(beanPos));
        if ((beanCh == '-') || (beanCh == '_')) {
          beanPos++;
          continue;
        }
        char elementCh=Character.toLowerCase(elementName.charAt(elementPos));
        if ((elementCh == '-') || (elementCh == '_')) {
          elementPos++;
          continue;
        }
        if (elementCh != beanCh)     return false;
        elementPos++;
        beanPos++;
      }
      if ((elementPos == elementNameLen) && (beanPos == beanNameLen)) {
        return true;
      }
      return false;
    }
}
