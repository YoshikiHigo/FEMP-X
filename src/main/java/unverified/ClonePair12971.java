package unverified;

public class ClonePair12971 {

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

    String method2(String source,String token,String replacement){
      int i1;
      int i2=0;
      int tl=token.length();
      StringBuffer r=new StringBuffer(source.length());
      do {
        i1=source.indexOf(token,i2);
        if (i1 >= i2) {
          if (i1 > i2)       r.append(source.substring(i2,i1));
          r.append(replacement);
          i2=i1 + tl;
        }
     else     r.append(source.substring(i2));
      }
     while (i1 >= 0);
      return r.toString();
    }
}
