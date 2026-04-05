package unverified;

public class ClonePair10648 {

    String method1(String old,String substring1,String substring2){
      StringBuffer returnBuffer=new StringBuffer();
      int len0=old.length();
      int len1=substring1.length();
      if (len1 > len0)   return new String(old);
     else {
        int exti=0;
        for (int i=0; i < len0 - len1 + 1; i++) {
          if (old.regionMatches(i,substring1,0,len1)) {
            returnBuffer.append(substring2);
            i+=len1 - 1;
          }
     else {
            returnBuffer.append(old.charAt(i));
          }
          exti=i;
        }
        for (int i=exti + 1; i < len0; i++) {
          returnBuffer.append(old.charAt(i));
        }
        return new String(returnBuffer);
      }
    }

    String method2(String str,String substr,String with){
      String outi=new String("");
      int width=str.length();
      int count=0;
      do {
        if (str.toLowerCase().indexOf(substr.toLowerCase(),count) != -1) {
          outi=outi + str.substring(count,str.toLowerCase().indexOf(substr.toLowerCase(),count)) + with;
          count=str.toLowerCase().indexOf(substr.toLowerCase(),count) + substr.length();
        }
     else {
          outi=outi + str.substring(count,str.length());
          count=str.length();
        }
      }
     while (count < width);
      return outi;
    }
}
