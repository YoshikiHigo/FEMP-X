package all;

public class ClonePair7256 {

    int method1(CharSequence s,char c){
      int count=0;
      for (int i=s.length(); --i >= 0; ) {
        if (s.charAt(i) == c)     count++;
      }
      return count;
    }

    int method2(CharSequence s,char c){
      int occurrences=0;
      for (int i=0, l=s.length(); i < l; i++) {
        if (s.charAt(i) == c) {
          occurrences++;
        }
      }
      return occurrences;
    }
}
