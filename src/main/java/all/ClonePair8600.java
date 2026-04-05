package all;

public class ClonePair8600 {

    int method1(String s,int i){
      int len=s.length();
      for (int j=i; j < len; j++)   if (Character.isSpaceChar(s.charAt(j)))   return (j);
      return (-1);
    }

    int method2(String haystack,int start){
      for (int i=start; i < haystack.length(); i++) {
        char c=haystack.charAt(i);
        if (c == ' ' || c == '\n' || c == '\r' || c == '\t')     return i;
      }
      return -1;
    }
}
