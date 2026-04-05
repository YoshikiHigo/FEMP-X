package unverified;

public class ClonePair12181 {

    int method1(String data,int start,char quoteChar){
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

    int method2(String str,int sIndex,char match){
      int level, length, i;
      boolean quoted=false;
      char c;
      level=0;
      for (i=sIndex, length=str.length(); i < length; i++) {
        if (quoted) {
          quoted=false;
          continue;
        }
        c=str.charAt(i);
        if ((level == 0) && (c == match)) {
          return i;
        }
        if (c == '{') {
          level++;
        }
     else     if (c == '}') {
          level--;
        }
     else     if (c == '\\') {
          quoted=true;
        }
      }
      return -1;
    }
}
