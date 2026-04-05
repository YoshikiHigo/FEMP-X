package unverified;

public class ClonePair12947 {

    String method1(String text,String toFind,String replaceBy){
      int pos=text.indexOf(toFind);
      if (pos == -1)   return text;
      StringBuffer result=new StringBuffer(text.length());
      while (pos >= 0) {
        result.append(text.substring(0,pos));
        result.append(replaceBy);
        text=text.substring(pos + toFind.length());
        pos=text.indexOf(toFind);
      }
      result.append(text);
      return (result.toString());
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
