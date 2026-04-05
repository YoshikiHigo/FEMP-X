package all;

public class ClonePair9752 {

    int method1(String s,int i){
      int j=i;
      while (j < s.length() && Character.isWhitespace(s.charAt(j))) {
        ++j;
      }
      return j;
    }

    int method2(String s,int start){
      while ((start < s.length()) && Character.isWhitespace(s.charAt(start)))   start++;
      return start;
    }
}
