package unverified;

public class ClonePair8097 {

    boolean method1(String str1,String str2){
      int i=0;
      int j=0;
      char quote=0;
      for (; ; ) {
        char x, y;
        for (; ; ) {
          if (i >= str1.length()) {
            x=0;
            break;
          }
          x=str1.charAt(i++);
          if (quote != 0 || !Character.isWhitespace(x))       break;
        }
        for (; ; ) {
          if (j >= str2.length()) {
            y=0;
            break;
          }
          y=str2.charAt(j++);
          if (quote != 0 || !Character.isWhitespace(y))       break;
        }
        if (x != y)     return false;
        if (x == 0)     return true;
        if (x == '\'' || x == '\"') {
          if (quote == 0)       quote=x;
     else       if (x == quote)       quote=0;
        }
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
