package all;

public class ClonePair11556 {

    String method1(String s,int maxLength){
      if (s.length() < maxLength) {
        return s;
      }
      return s.substring(0,maxLength - 3) + "...";
    }

    String method2(String summary,int len){
      if (summary.length() >= len) {
        return summary.substring(0,len - 1) + "…";
      }
      return summary;
    }
}
