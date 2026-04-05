package unverified;

public class ClonePair8518 {

    int method1(String source,int startIndex){
      int i;
      for (i=startIndex; i < source.length() && Character.isWhitespace(source.charAt(i)); i++) {
      }
      if (i >= source.length())   i=-1;
      return i;
    }

    int method2(String s,int i){
      for (; i < s.length(); i++) {
        char ch=s.charAt(i);
        if (ch != ' ' && ch != '\t')     return i;
      }
      return -1;
    }
}
