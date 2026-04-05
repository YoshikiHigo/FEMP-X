package all;

public class ClonePair11865 {

    String method1(String string,int i){
      int cutpos=string.length() - i;
      if (cutpos < 0)   return string;
      return string.substring(cutpos);
    }

    String method2(String text,int max){
      int len=text.length();
      if (max >= len)   return text;
      int pos=len - max;
      while (pos < len)   if (Character.isWhitespace(text.charAt(pos)))   break;
     else   pos++;
      if (pos == len)   pos=len - max;
      return text.substring(pos);
    }
}
