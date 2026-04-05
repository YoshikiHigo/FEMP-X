package unverified;

public class ClonePair11723 {

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

    String method2(String str,String match,String to){
      if ((str == null) || (match == null) || (to == null)) {
        return str;
      }
      StringBuffer dest=new StringBuffer();
      int len=match.length();
      String org=str;
      int index=org.indexOf(match);
      while (index != -1) {
        dest.append(org.substring(0,index));
        dest.append(to);
        org=org.substring(index + len);
        index=org.indexOf(match);
      }
      dest.append(org);
      return dest.toString();
    }
}
