package unverified;

public class ClonePair11368 {

    String method1(String source,String from,String to){
      StringBuffer result=new StringBuffer(source);
      int idx=source.indexOf(from);
      int lastPos=0;
      if (idx > -1)   result=new StringBuffer();
      while (idx > -1) {
        result.append(source.substring(lastPos,idx));
        result.append(to);
        lastPos=idx + from.length();
        idx=source.indexOf(from,lastPos);
        if (idx < 0)     result.append(source.substring(lastPos,source.length()));
      }
      return result.toString();
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
