package all;

public class ClonePair5277 {

    int method1(char[] charArray,int pos){
      while (true) {
        if (pos >= charArray.length) {
          break;
        }
        if (!Character.isDigit(charArray[pos])) {
          break;
        }
        pos++;
      }
      return pos;
    }

    int method2(char[] cToken,int start){
      while (start < cToken.length && Character.isDigit(cToken[start]))   ++start;
      return start;
    }
}
