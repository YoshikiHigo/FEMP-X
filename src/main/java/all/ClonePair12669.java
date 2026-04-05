package all;

public class ClonePair12669 {

    String method1(String s,char c){
      int fill=0, end=s.length();
      if (end == 0)   return s;
      while ((fill < end) && (s.charAt(fill) == c))   fill++;
      return (fill < end) ? s.substring(fill,end) : s.substring(fill - 1,end);
    }

    String method2(String s,char c){
      int end=s.length();
      if (end == 0)   return s;
      while ((0 < end) && (s.charAt(end - 1) == c))   end--;
      return (0 < end) ? s.substring(0,end) : s.substring(0,1);
    }
}
