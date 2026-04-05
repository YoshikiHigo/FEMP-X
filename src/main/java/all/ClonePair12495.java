package all;

public class ClonePair12495 {

    String method1(String string,String oldPattern,String newPattern){
      if (string == null)   return string;
      int oldIndex=string.indexOf(oldPattern);
      if (oldIndex < 0)   return string;
      StringBuffer returnVal=new StringBuffer();
      int start=0;
      do {
        returnVal.append(string.substring(start,oldIndex));
        returnVal.append(newPattern);
        start=oldIndex + oldPattern.length();
        oldIndex=string.indexOf(oldPattern,start);
      }
     while (oldIndex > 0);
      returnVal.append(string.substring(start));
      return returnVal.toString();
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
