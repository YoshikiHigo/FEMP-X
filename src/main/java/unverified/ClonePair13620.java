package unverified;

public class ClonePair13620 {

    String method1(String a_source,String a_toReplace,String a_replaceWith){
      int position;
      while ((position=a_source.indexOf(a_toReplace)) != -1) {
        int position2=a_source.indexOf(a_replaceWith);
        if (a_replaceWith.indexOf(a_toReplace) != -1) {
          position2+=a_replaceWith.indexOf(a_toReplace);
        }
        if (position == position2) {
          break;
        }
        String before=a_source.substring(0,position);
        String after=a_source.substring(position + a_toReplace.length(),a_source.length());
        a_source=before + a_replaceWith + after;
      }
      return a_source;
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
