package all;

public class ClonePair10052 {

    String method1(String text,String startDelimiter,String endDelimiter){
      int start;
      int stop;
      String subStr="";
      if ((text != null) && (startDelimiter != null) && (endDelimiter != null)) {
        start=text.indexOf(startDelimiter);
        if (start >= 0) {
          stop=text.indexOf(endDelimiter,start + 1);
          if (stop > start) {
            subStr=text.substring(start + 1,stop);
          }
        }
      }
      return subStr;
    }

    String method2(String text,String startDelimiter,String endDelimiter){
      int start;
      int stop;
      String subStr="";
      if ((text != null) && (startDelimiter != null) && (endDelimiter != null)) {
        start=text.indexOf(startDelimiter);
        if (start >= 0) {
          stop=text.indexOf(endDelimiter,start + 1);
          if (stop > start)       subStr=text.substring(start + 1,stop);
        }
      }
      return subStr;
    }
}
