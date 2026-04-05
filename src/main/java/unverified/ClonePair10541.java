package unverified;

public class ClonePair10541 {

    int method1(String str,int pos){
      for (; pos < str.length(); pos++) {
        char c=str.charAt(pos);
        if (!(c == ' ' || c == '\t')) {
          return pos;
        }
      }
      return -1;
    }

    int method2(String s,int i){
      for (; i < s.length(); i++) {
        char ch=s.charAt(i);
        if (ch != ' ' && ch != '\t')     return i;
      }
      return -1;
    }
}
