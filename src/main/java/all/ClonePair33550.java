package all;

public class ClonePair33550 {

    int method1(CharSequence s,char c){
      int occurrences=0;
      for (int i=0, l=s.length(); i < l; i++) {
        if (s.charAt(i) == c) {
          occurrences++;
        }
      }
      return occurrences;
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
