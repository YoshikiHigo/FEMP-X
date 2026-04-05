package all;

public class ClonePair11005 {

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

    int method2(CharSequence s,CharSequence t){
      int i=0;
      while (i < s.length() && i < t.length()) {
        char a=s.charAt(i);
        char b=t.charAt(i);
        int diff=a - b;
        if (diff != 0) {
          return diff;
        }
        i++;
      }
      return s.length() - t.length();
    }
}
