package unverified;

public class ClonePair8742 {

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

    boolean method2(String arg1,String arg2){
      if (arg1.length() > arg2.length())   return false;
      boolean returnArg=true;
      int i=0;
      int length=arg1.length();
      while (i < length) {
        char x=arg1.charAt(i);
        char y=arg2.charAt(i);
        if (x != y) {
          returnArg=false;
          break;
        }
        i+=1;
      }
      if (arg2.length() > length) {
        if (arg2.charAt(i) != '.')     returnArg=false;
      }
      return returnArg;
    }
}
