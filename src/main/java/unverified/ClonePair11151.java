package unverified;

public class ClonePair11151 {

    int method1(String source,String match){
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

    int method2(String str,String sub){
      if (str == null || sub == null || str.length() == 0 || sub.length() == 0) {
        return 0;
      }
      int count=0;
      int pos=0;
      int idx;
      while ((idx=str.indexOf(sub,pos)) != -1) {
        ++count;
        pos=idx + sub.length();
      }
      return count;
    }
}
