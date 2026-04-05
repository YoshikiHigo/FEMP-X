package unverified;

public class ClonePair11248 {

    int method1(String text,String match){
      int lastIndex=-1;
      int index=text.indexOf(match);
      while (index != -1) {
        lastIndex=index;
        index=text.indexOf(match,lastIndex + 1);
      }
      return lastIndex;
    }

    int method2(String text,String symbol){
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
}
