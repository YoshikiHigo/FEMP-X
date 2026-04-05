package unverified;

public class ClonePair4180 {

    boolean method1(String one,String two){
      int index1=one.indexOf("[");
      int index2=two.indexOf("[");
      if (index1 > 0) {
        one=one.substring(0,index1);
      }
      if (index2 > 0) {
        two=two.substring(0,index2);
      }
      return one.equals(two);
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
