package all;

public class ClonePair13670 {

    String method1(String s,String s1,String s2){
      if (s == null || s1 == null || s2 == null) {
        return "";
      }
      return s.replaceAll(s1,s2);
    }

    String method2(String source,String oldString,String newString){
      if (source == null || oldString == null || newString == null)   return "";
     else   return source.replaceAll(oldString,newString);
    }
}
