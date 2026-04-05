package all;

public class ClonePair11155 {

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

    int method2(String source,String find){
      if (source == null || source.length() == 0 || find == null || find.length() == 0) {
        return 0;
      }
      int count=0;
      int pos=source.indexOf(find,0);
      while (pos != -1) {
        ++count;
        pos=source.indexOf(find,pos + 1);
      }
      return count;
    }
}
