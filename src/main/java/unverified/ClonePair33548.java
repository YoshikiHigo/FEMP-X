package unverified;

public class ClonePair33548 {

    int method1(CharSequence s,char c){
      int sum=0;
      for (int i=0; i < s.length(); i++) {
        if (s.charAt(i) == c) {
          sum++;
        }
      }
      return sum;
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
