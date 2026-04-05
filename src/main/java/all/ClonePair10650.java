package all;

public class ClonePair10650 {

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

    String method2(String s,String find,String replace){
      int found=s.indexOf(find);
      if (found == -1) {
        return s;
      }
      StringBuffer sb=new StringBuffer(s.length());
      int start=0;
      for (; ; ) {
        for (; start < found; start++) {
          sb.append(s.charAt(start));
        }
        if (found == s.length()) {
          break;
        }
        sb.append(replace);
        start+=find.length();
        found=s.indexOf(find,start);
        if (found == -1) {
          found=s.length();
        }
      }
      return sb.toString();
    }
}
