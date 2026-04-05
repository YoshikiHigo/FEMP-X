package unverified;

public class ClonePair12510 {

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

    String method2(String string,String leading,String trailing){
      int i_start=string.indexOf(leading);
      if (i_start < 0) {
        return null;
      }
      i_start+=leading.length();
      int i_end=string.indexOf(trailing,i_start);
      if (i_end < 0) {
        return null;
      }
      return string.substring(i_start,i_end);
    }
}
