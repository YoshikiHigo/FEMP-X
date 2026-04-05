package all;

public class ClonePair12179 {

    int method1(String str,int start,char toFind){
      boolean escaped=false;
      for (int i=start; i < str.length(); i++) {
        char c=str.charAt(i);
        if (c == '\\') {
          escaped=true;
        }
     else {
          if (!escaped && c == toFind)       return i;
          escaped=false;
        }
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
