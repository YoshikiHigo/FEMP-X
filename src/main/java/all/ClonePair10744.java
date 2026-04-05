package all;

public class ClonePair10744 {

    String method1(String data,String startTXT,String endTXT){
      int start=data.indexOf(startTXT);
      if (start > 0) {
        int end=data.indexOf(endTXT,start);
        if (end > start + startTXT.length()) {
          String ding=data.substring(startTXT.length() + start,end);
          return ding.trim();
        }
     else {
          return "";
        }
      }
     else {
        return "";
      }
    }

    String method2(String source,String begin,String end){
      assert (begin.length() > 0 && end.length() > 0);
      int beginIndex=source.indexOf(begin);
      if (beginIndex == -1)   return "";
      beginIndex+=begin.length();
      int endIndex=source.indexOf(end);
      if (beginIndex > endIndex)   return "";
      return source.substring(beginIndex,endIndex);
    }
}
