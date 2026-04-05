package unverified;

public class ClonePair8727 {

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
      if (s1.length() != s2.length()) {
        System.out.println("Compare failed: lengths differ");
        return false;
      }
      for (int i=0; i < s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
          System.out.println("Compare failed: bytes at " + i + " differ ["+ s1.charAt(i)+ "] ["+ s2.charAt(i)+ "]");
          return false;
        }
      }
      return true;
    }
}
