package all;

public class ClonePair11282 {

    int method1(String text,String symbol){
      boolean quoted=false;
      int lastIndex=-1;
      for (int i=0; i < text.length(); i++) {
        if (text.charAt(i) == '"') {
          quoted=!quoted;
        }
        if (quoted) {
          continue;
        }
        if ((i + symbol.length() <= text.length()) && text.subSequence(i,i + symbol.length()).equals(symbol)) {
          lastIndex=i;
        }
      }
      return lastIndex;
    }

    int method2(String dans,String cherche){
      int lastTrouve=-1;
      int trouve=-1;
      while ((trouve=dans.indexOf(cherche,trouve + 1)) != -1) {
        lastTrouve=trouve;
      }
      return lastTrouve;
    }
}
