package all;

public class ClonePair13432 {

    String method1(String string,String from,String to){
      if ((string == null) || (string.length() == 0)) {
        return string;
      }
     else   if ((string.length() == 1) && string.equals(from)) {
        return to;
      }
     else   if ((string.length() == 1) && !string.equals(from)) {
        return string;
      }
      int index=-1;
      while ((index=string.indexOf(from)) >= 0) {
        string=string.substring(0,index) + (char)5 + string.substring(index + from.length());
      }
      int sunIndex=-1;
      while ((sunIndex=string.indexOf((char)5)) >= 0) {
        string=string.substring(0,sunIndex) + to + string.substring(sunIndex + 1);
      }
      return string;
    }

    String method2(String str,String from,String to){
      if (str == null || str.length() == 0) {
        return str;
      }
     else   if (str.length() == 1 && str.equals(from)) {
        return to;
      }
     else   if (str.length() == 1 && !str.equals(from)) {
        return str;
      }
      int j=-1;
      while ((j=str.indexOf(from)) >= 0) {
        str=str.substring(0,j) + (char)5 + str.substring(j + from.length());
      }
      int i=-1;
      while ((i=str.indexOf((char)5)) >= 0) {
        str=str.substring(0,i) + to + str.substring(i + 1);
      }
      return str;
    }
}
