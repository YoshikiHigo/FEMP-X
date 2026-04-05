package unverified;

public class ClonePair8741 {

    boolean method1(String beanName,String elementName){
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

    boolean method2(String s1,String s2){
      if (s1.length() == s2.length()) {
        final char c1[]=s1.toCharArray();
        final char c2[]=s2.toCharArray();
        int n=s1.length();
        while (--n >= 0) {
          if (c1[n] != c2[n]) {
            return false;
          }
        }
      }
     else {
        return false;
      }
      return true;
    }
}
