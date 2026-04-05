package all;

public class ClonePair3915 {

    int method1(CharSequence s,char c,int fromIndex){
      for (int i=fromIndex; i < s.length(); i++) {
        if (s.charAt(i) == c)     return i;
      }
      return -1;
    }

    int method2(CharSequence s,char c,int fromIndex){
      for (int i=fromIndex; i < s.length(); i++) {
        if (s.charAt(i) == c) {
          return i;
        }
      }
      return -1;
    }
}
