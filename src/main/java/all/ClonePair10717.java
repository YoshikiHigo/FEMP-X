package all;

public class ClonePair10717 {

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

    String method2(String value,String oldPart,String newPart){
      if (value == null || value.length() == 0 || oldPart == null || oldPart.length() == 0)   return value;
      int oldPartLength=oldPart.length();
      String oldValue=value;
      StringBuffer retValue=new StringBuffer();
      int pos=oldValue.indexOf(oldPart);
      while (pos != -1) {
        retValue.append(oldValue.substring(0,pos));
        if (newPart != null && newPart.length() > 0)     retValue.append(newPart);
        oldValue=oldValue.substring(pos + oldPartLength);
        pos=oldValue.indexOf(oldPart);
      }
      retValue.append(oldValue);
      return retValue.toString();
    }
}
