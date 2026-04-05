package unverified;

public class ClonePair11007 {

    int method1(CharSequence s,CharSequence t){
      int i=0;
      while (i < s.length() && i < t.length()) {
        char a=Character.toLowerCase(s.charAt(i));
        char b=Character.toLowerCase(t.charAt(i));
        int diff=a - b;
        if (diff != 0) {
          return diff;
        }
        i++;
      }
      return s.length() - t.length();
    }

    int method2(CharSequence text1,CharSequence text2){
      int len=Math.min(text1.length(),text2.length());
      for (int i=0; i < len; i++) {
        char ch1=text1.charAt(i);
        char ch2=text2.charAt(i);
        if (ch1 != ch2) {
          return ch1 - ch2;
        }
      }
      return text1.length() - text2.length();
    }
}
