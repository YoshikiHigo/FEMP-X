package unverified;

public class ClonePair12175 {

    int method1(String text,int offset,char delimiter){
      for (int i=offset; i < text.length(); ++i) {
        char value=text.charAt(i);
        if (value == delimiter)     return i;
      }
      return -1;
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
