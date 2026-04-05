package unverified;

public class ClonePair12170 {

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
