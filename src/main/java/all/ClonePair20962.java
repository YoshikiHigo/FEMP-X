package all;

public class ClonePair20962 {

    int method1(CharSequence s,char c){
      int sum=0;
      for (int i=0; i < s.length(); i++) {
        if (s.charAt(i) == c) {
          sum++;
        }
      }
      return sum;
    }

    int method2(CharSequence s,char c){
      int count=0;
      for (int i=s.length(); --i >= 0; ) {
        if (s.charAt(i) == c)     count++;
      }
      return count;
    }
}
