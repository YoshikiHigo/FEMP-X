package unverified;

public class ClonePair11710 {

    String method1(String initialString,String toReplace,String replacement){
      if (initialString == null) {
        return null;
      }
      if (toReplace != null && !(toReplace.equals("")) && replacement != null) {
        StringBuffer stb=new StringBuffer();
        int index=initialString.indexOf(toReplace);
        int oldIndex=0;
        while (index != -1) {
          stb.append(initialString.substring(oldIndex,index));
          stb.append(replacement);
          oldIndex=index + toReplace.length();
          index=initialString.indexOf(toReplace,index + toReplace.length());
        }
        stb.append(initialString.substring(oldIndex));
        return stb.toString();
      }
     else {
        return initialString;
      }
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
