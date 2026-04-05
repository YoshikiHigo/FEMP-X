package unverified;

public class ClonePair11622 {

    String method1(String s,String oldPart,String newPart){
      if ((s == null) || (oldPart == null) || (newPart == null)) {
        return s;
      }
      int i=s.indexOf(oldPart);
      if (i < 0) {
        return s;
      }
      return s.substring(0,i) + newPart + s.substring(i + oldPart.length());
    }

    String method2(String s,String s1,String s2){
      if ("".equals(s1) || "".equals(s) || s == null || s1 == null || s2 == null)   return s;
      StringBuffer stringbuffer=null;
      int j=0;
      int i;
      while ((i=s.indexOf(s1,j)) != -1) {
        String s4=s.substring(j,i);
        j=i + s1.length();
        if (stringbuffer == null)     stringbuffer=new StringBuffer(s2.length());
        stringbuffer.append(s4);
        stringbuffer.append(s2);
      }
      return stringbuffer != null ? stringbuffer.append(s.substring(j)).toString() : s;
    }
}
