package all;

public class ClonePair12173 {

    int method1(String text,int offset,char delimiter){
      for (int i=offset; i < text.length(); ++i) {
        char value=text.charAt(i);
        if (value == delimiter)     return i;
      }
      return -1;
    }

    int method2(String str,int start,char toFind){
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
}
