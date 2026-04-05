package all;

public class ClonePair7255 {

    int method1(CharSequence s,char c){
      for (int i=s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) == c)     return i;
      }
      return -1;
    }

    int method2(CharSequence word,char c){
      for (int i=0; i < word.length(); i++) {
        if (word.charAt(i) == c) {
          return i;
        }
      }
      return -1;
    }
}
