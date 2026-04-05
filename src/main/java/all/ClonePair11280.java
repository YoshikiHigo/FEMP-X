package all;

public class ClonePair11280 {

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

    int method2(String base,String str){
      int result=0, temp=0;
      result=temp=base.indexOf(str);
      while (temp != -1) {
        result=temp;
        temp=base.indexOf(str,result + 1);
      }
      return result;
    }
}
