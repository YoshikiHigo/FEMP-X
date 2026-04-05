package unverified;

public class ClonePair8740 {

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
