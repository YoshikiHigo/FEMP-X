package all;

public class ClonePair10540 {

    String method1(String input,String searchStr,String replaceWithStr){
      StringBuffer buffer=new StringBuffer();
      int startIndex=0;
      int oldIndex=0;
      if (input.indexOf(searchStr) == -1) {
        return input;
      }
      while ((startIndex=input.indexOf(searchStr,oldIndex)) != -1) {
        buffer.append(input.substring(oldIndex,startIndex));
        buffer.append(replaceWithStr);
        startIndex+=searchStr.length();
        oldIndex=startIndex;
        if (oldIndex >= input.length()) {
          break;
        }
      }
      if (oldIndex < input.length()) {
        buffer.append(input.substring(oldIndex));
      }
      return buffer.toString();
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
