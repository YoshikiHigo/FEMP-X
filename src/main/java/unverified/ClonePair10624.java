package unverified;

public class ClonePair10624 {

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

    String method2(String text,String find,String replace){
      int findLength=find.length();
      StringBuffer buffer=new StringBuffer();
      int i;
      for (i=0; i < text.length() - find.length() + 1; i++) {
        String substring=text.substring(i,i + findLength);
        if (substring.equals(find)) {
          buffer.append(replace);
          i+=find.length() - 1;
        }
     else {
          buffer.append(text.charAt(i));
        }
      }
      buffer.append(text.substring(text.length() - (text.length() - i)));
      return buffer.toString();
    }
}
