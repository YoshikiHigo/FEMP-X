package all;

public class ClonePair11164 {

    int method1(String text1,String text2){
      int text1_length=text1.length();
      int text2_length=text2.length();
      int n=Math.min(text1_length,text2_length);
      for (int i=1; i <= n; i++) {
        if (text1.charAt(text1_length - i) != text2.charAt(text2_length - i)) {
          return i - 1;
        }
      }
      return n;
    }

    int method2(String s,String t){
      int i=s.length() - 1;
      int j=t.length() - 1;
      for (; i >= 0 && j >= 0; --i, --j)   if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(t.charAt(j)))   return s.length() - (i + 1);
      return s.length() - (i + 1);
    }
}
