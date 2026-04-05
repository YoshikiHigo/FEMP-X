package unverified;

public class ClonePair8680 {

    boolean method1(String balise,String name){
      int length=balise.length();
      if (!balise.isEmpty() && balise.charAt(length - 1) == '*') {
        return name.startsWith(balise.substring(0,length - 1));
      }
     else {
        return name.equals(balise);
      }
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
