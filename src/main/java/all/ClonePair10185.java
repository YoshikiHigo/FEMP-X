package all;

public class ClonePair10185 {

    int method1(String s,int start){
      while ((start < s.length()) && Character.isWhitespace(s.charAt(start)))   start++;
      return start;
    }

    int method2(String rawdata,int i){
      int length=rawdata.length();
      while ((i < length) && Character.isWhitespace(rawdata.charAt(i)))   i++;
      return i;
    }
}
