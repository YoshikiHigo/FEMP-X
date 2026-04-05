package all;

public class ClonePair5294 {

    int method1(char[] str,int pos){
      int len=str.length;
      while (pos < len && !Character.isWhitespace(str[pos]))   pos++;
      return pos;
    }

    int method2(char[] cToken,int start){
      while (start < cToken.length && !Character.isWhitespace(cToken[start]))   ++start;
      return start;
    }
}
