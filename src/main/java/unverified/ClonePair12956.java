package unverified;

public class ClonePair12956 {

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

    String method2(String source,String toBeReplaced,String replacement){
      StringBuffer results=new StringBuffer();
      int len=toBeReplaced.length();
      for (int i=0; i < source.length(); ++i) {
        if (source.regionMatches(false,i,toBeReplaced,0,len)) {
          results.append(replacement);
          i+=len - 1;
        }
     else {
          results.append(source.charAt(i));
        }
      }
      return results.toString();
    }
}
