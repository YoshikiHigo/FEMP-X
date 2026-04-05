package all;

public class ClonePair12169 {

    int method1(String text,int startIndex,char c){
      int retVal=-1;
      int pos=startIndex;
      while (pos < text.length()) {
        if (text.charAt(pos) == c) {
          retVal=pos;
          break;
        }
        pos++;
      }
      return retVal;
    }

    int method2(String text,int offset,char delimiter){
      for (int i=offset; i < text.length(); ++i) {
        char value=text.charAt(i);
        if (value == delimiter)     return i;
      }
      return -1;
    }
}
