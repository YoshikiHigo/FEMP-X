package all;

public class ClonePair10809 {

    String method1(String in,String t1,String t2){
      StringBuffer result=new StringBuffer();
      int i=0;
      while (i < in.length()) {
        if (in.startsWith(t1,i)) {
          result.append(t2);
          if (t1.length() == 0) {
            result.append(in.charAt(i));
            i++;
          }
     else       i+=t1.length();
        }
     else {
          result.append(in.charAt(i));
          i++;
        }
      }
      return result.toString();
    }

    String method2(String s,String sub,String with){
      int c=0;
      int i=s.indexOf(sub,c);
      if (i == -1) {
        return s;
      }
      StringBuffer buf=new StringBuffer(s.length() + with.length());
      int n=s.length();
      do {
        buf.append(s.substring(c,i));
        int beginChar=i > 0 ? s.charAt(i - 1) : -1;
        int m=i + sub.length();
        int endChar=m < n ? s.charAt(m) : -1;
        if (((beginChar == -1) || (!Character.isJavaIdentifierStart((char)beginChar))) && ((endChar == -1) || (!Character.isJavaIdentifierPart((char)endChar)))) {
          buf.append(with);
        }
     else {
          buf.append(sub);
        }
        c=i + sub.length();
      }
     while ((i=s.indexOf(sub,c)) != -1);
      if (c < s.length()) {
        buf.append(s.substring(c,s.length()));
      }
      return buf.toString();
    }
}
