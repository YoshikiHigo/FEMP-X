package all;

public class ClonePair12171 {

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

    int method2(String data,int start,char quoteChar){
      int stepChar=start;
      int stringLength=data.length();
      while (stepChar < stringLength) {
        if (data.charAt(stepChar) == '\\') {
          ++stepChar;
        }
     else     if (data.charAt(stepChar) == quoteChar) {
          return stepChar;
        }
        ++stepChar;
      }
      return -1;
    }
}
