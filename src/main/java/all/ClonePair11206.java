package all;

public class ClonePair11206 {

    int method1(String s,String t){
      int i=s.length() - 1;
      int j=t.length() - 1;
      for (; i >= 0 && j >= 0; --i, --j)   if (s.charAt(i) != t.charAt(j))   return s.length() - (i + 1);
      return s.length() - (i + 1);
    }

    int method2(String s,String t){
      int i=s.length() - 1;
      int j=t.length() - 1;
      for (; i >= 0 && j >= 0; --i, --j)   if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(t.charAt(j)))   return s.length() - (i + 1);
      return s.length() - (i + 1);
    }
}
