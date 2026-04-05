package unverified;

public class ClonePair9166 {

    int method1(String string,String sub){
      if (string == null || string.length() == 0 || sub == null || sub.length() == 0)   return 0;
      int count=0;
      int index=0;
      while ((index=string.indexOf(sub,index)) != -1) {
        count++;
        index+=sub.length();
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
