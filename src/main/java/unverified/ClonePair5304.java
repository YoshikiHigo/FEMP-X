package unverified;

public class ClonePair5304 {

    int method1(char[] cToken,int start){
      while (start < cToken.length && !Character.isWhitespace(cToken[start]))   ++start;
      return start;
    }

    int method2(char[] cToken,int start){
      while (start < cToken.length && !Character.isWhitespace(cToken[start])) {
        cToken[start]=Character.toLowerCase(cToken[start]);
        ++start;
      }
      return start;
    }
}
