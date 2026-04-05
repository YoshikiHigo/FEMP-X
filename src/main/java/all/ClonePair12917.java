package all;

public class ClonePair12917 {

    int method1(String s){
      int value=0;
      char[] src=s.toCharArray();
      for (int i=0; i < src.length; i++) {
        value*=16;
        if ((src[i] >= '0') && (src[i] <= '9'))     value+=(src[i] - '0');
     else     if ((src[i] >= 'A') && (src[i] <= 'F'))     value+=(src[i] - 'A' + 10);
     else     if ((src[i] >= 'a') && (src[i] <= 'f'))     value+=(src[i] - 'a' + 10);
     else {
          value/=16;
          break;
        }
      }
      return value;
    }

    int method2(String str){
      int size=str.length();
      int hex=0;
      for (int i=0; i < size; ++i) {
        char c=str.charAt(i);
        if (c >= '0' && c <= '9')     hex=hex * 16 + (c - '0');
     else     if (c >= 'a' && c <= 'f')     hex=hex * 16 + 10 + (c - 'a');
     else     if (c >= 'A' && c <= 'F')     hex=hex * 16 + 10 + (c - 'A');
     else     break;
      }
      return hex;
    }
}
