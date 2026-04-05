package all;

public class ClonePair20964 {

    int method1(CharSequence s,char c){
      int count=0;
      for (int i=s.length(); --i >= 0; ) {
        if (s.charAt(i) == c)     count++;
      }
      return count;
    }

    int method2(CharSequence seq,char c){
      int count=0;
      for (int i=0, n=seq.length(); i < n; i++) {
        if (c == seq.charAt(i)) {
          count++;
        }
      }
      return count;
    }
}
