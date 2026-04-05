package all;

public class ClonePair12940 {

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

    String method2(String src,String replace,String with){
      String result;
      int pos;
      result="";
      while (!src.equals("")) {
        pos=src.indexOf(replace);
        if (pos == -1) {
          result+=src;
          src="";
        }
     else {
          result+=src.substring(0,pos) + with;
          src=src.substring(pos + replace.length(),src.length());
        }
      }
      return result;
    }
}
