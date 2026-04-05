package all;

public class ClonePair12943 {

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

    String method2(String str,String repl,String with){
      int lastindex=0;
      int pos=str.indexOf(repl);
      if (pos < 0) {
        return str;
      }
      int len=repl.length();
      int lendiff=with.length() - repl.length();
      StringBuilder out=new StringBuilder((lendiff <= 0) ? str.length() : (str.length() + (lendiff << 3)));
      for (; pos >= 0; pos=str.indexOf(repl,lastindex=pos + len)) {
        out.append(str.substring(lastindex,pos)).append(with);
      }
      return out.append(str.substring(lastindex,str.length())).toString();
    }
}
