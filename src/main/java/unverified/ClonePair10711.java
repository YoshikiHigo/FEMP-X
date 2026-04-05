package unverified;

public class ClonePair10711 {

    String method1(String s,String replace,String with){
      if (s == null || replace == null) {
        return s;
      }
      if (with == null) {
        with="";
      }
      StringBuffer b=new StringBuffer();
      int start=0;
      int lenreplace=replace.length();
      while (true) {
        int i=s.indexOf(replace,start);
        if (i == -1) {
          b.append(s.substring(start));
          break;
        }
        b.append(s.substring(start,i - start));
        b.append(with);
        start=i + lenreplace;
      }
      return b.toString();
    }

    String method2(String mainString,String oldString,String newString){
      if (mainString == null) {
        return null;
      }
      if (oldString == null || oldString.length() == 0) {
        return mainString;
      }
      if (newString == null) {
        newString="";
      }
      int i=mainString.lastIndexOf(oldString);
      if (i < 0)   return mainString;
      StringBuffer mainSb=new StringBuffer(mainString);
      while (i >= 0) {
        mainSb.replace(i,i + oldString.length(),newString);
        i=mainString.lastIndexOf(oldString,i - 1);
      }
      return mainSb.toString();
    }
}
