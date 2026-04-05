package all;

public class ClonePair10123 {

    int method1(String text,String pattern){
      if (text.length() == 0 || pattern.length() == 0)   return -1;
      OUTER:   for (int i=0; i + pattern.length() <= text.length(); i++) {
        for (int j=0; j < pattern.length(); j++) {
          if (text.charAt(i + j) != pattern.charAt(j)) {
            continue OUTER;
          }
        }
        return i;
      }
      return -1;
    }

    int method2(String text,String match){
      int lastIndex=-1;
      int index=text.indexOf(match);
      while (index != -1) {
        lastIndex=index;
        index=text.indexOf(match,lastIndex + 1);
      }
      return lastIndex;
    }
}
