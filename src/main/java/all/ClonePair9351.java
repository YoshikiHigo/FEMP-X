package all;

public class ClonePair9351 {

    int method1(String string,String other){
      if (null == string)   return 0;
      if (null == other)   return 0;
      if (0 >= string.length())   return 0;
      if (0 >= other.length())   return 0;
      int count=0;
      int index=0;
      while ((index <= string.length() - other.length()) && (-1 != (index=string.indexOf(other,index)))) {
        count++;
        index+=other.length();
      }
      return count;
    }

    int method2(String source,String match){
      int count=0;
      if (source != null && match != null && match.length() > 0) {
        int currPos=0;
        while (source.length() >= currPos && (currPos=source.indexOf(match,currPos)) > -1) {
          currPos++;
          count++;
        }
      }
      return count;
    }
}
