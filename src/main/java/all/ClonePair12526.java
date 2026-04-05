package all;

public class ClonePair12526 {

    String method1(String searchIn,String beginString,String endString){
      int beginpos=searchIn.indexOf(beginString);
      int endpos=-1;
      if (beginpos != -1) {
        endpos=searchIn.substring(beginpos + beginString.length()).indexOf(endString);
        if (endpos != -1) {
          return searchIn.substring(beginpos + beginString.length(),beginpos + beginString.length() + endpos);
        }
      }
      return null;
    }

    String method2(String text,String start,String end){
      int i=0;
      int j=0;
      if ((i=text.indexOf(start)) > -1 && (j=text.indexOf(end,i + start.length())) > -1) {
        return text.substring(i + start.length(),j);
      }
      return null;
    }
}
