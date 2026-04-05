package all;

public class ClonePair10920 {

    String method1(String source,String old,String newstring){
      String sRet="";
      if (source != null && old != null && newstring != null) {
        for (int i=0; i < source.length(); i++) {
          if ((source.length() - i) < (old.length())) {
            while (i < source.length()) {
              sRet+=source.substring(i,i + 1);
              i++;
            }
            break;
          }
          if (source.substring(i,i + old.length()).equals(old)) {
            sRet+=newstring;
            i+=old.length() - 1;
          }
     else {
            sRet+=source.substring(i,i + 1);
          }
        }
      }
      return sRet;
    }

    String method2(String resource,String oldstr,String newstr){
      StringBuffer sbuf=new StringBuffer();
      try {
        if ((oldstr == null)) {
          return "";
        }
        if ((resource == null)) {
          return "";
        }
        if ((newstr == null)) {
          return "";
        }
        if (resource.indexOf(oldstr) == -1) {
          return resource;
        }
        int start=0;
        int end=0;
        String rest="";
        end=resource.indexOf(oldstr);
        String left="";
        while (end != -1) {
          left=resource.substring(start,end);
          sbuf.append(left);
          sbuf.append(newstr);
          rest=resource.substring(end + oldstr.length());
          resource=rest;
          end=resource.indexOf(oldstr);
        }
        sbuf.append(rest);
      }
     catch (  Exception e) {
        e.printStackTrace();
        return "";
      }
      return sbuf.toString();
    }
}
