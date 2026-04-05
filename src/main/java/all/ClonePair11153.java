package all;

public class ClonePair11153 {

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
      if (str == null || str.length() == 0 || sub == null || sub.length() == 0) {
        return 0;
      }
      int count=0;
      int idx=0;
      while ((idx=str.indexOf(sub,idx)) != -1) {
        count++;
        idx+=sub.length();
      }
      return count;
    }
}
