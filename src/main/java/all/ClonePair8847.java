package all;

public class ClonePair8847 {

    int method1(String s,int i){
      int len=s.length();
      while (i < len && Character.isDigit(s.charAt(i))) {
        i++;
      }
      return i;
    }

    int method2(String str,int i){
      for (int len=str.length(); i < len; i++) {
        if ("0123456789".indexOf(str.charAt(i)) < 0)     break;
      }
      return i;
    }
}
