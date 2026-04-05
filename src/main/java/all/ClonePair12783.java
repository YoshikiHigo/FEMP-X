package all;

public class ClonePair12783 {

    String method1(String src,String ori,String tar){
      String result=null;
      if (src != null && ori != null && tar != null) {
        try {
          StringBuffer source=new StringBuffer(src);
          int appearedIndex=0;
          int oriLength=ori.length();
          int tarLength=tar.length();
          int byPassingIndex=0;
          while (source.indexOf(ori,byPassingIndex) != -1) {
            appearedIndex=source.indexOf(ori,byPassingIndex);
            if (ori.equals(source.substring(appearedIndex,appearedIndex + oriLength))) {
              source=source.replace(appearedIndex,appearedIndex + oriLength,tar);
              byPassingIndex=appearedIndex + tarLength;
            }
     else {
              byPassingIndex=appearedIndex;
            }
          }
          result=source.toString();
        }
     catch (    Exception e) {
          e.printStackTrace();
        }
      }
      return result;
    }

    String method2(String haystack,String needle,String replace){
      boolean issub=false;
      if (haystack == null || needle == null || replace == null)   return null;
      if (replace.indexOf(needle) > -1)   issub=true;
      int offset=0;
      while (true) {
        int pos=haystack.indexOf(needle,offset);
        if (pos > -1) {
          if (issub && haystack.indexOf(replace,offset) == pos) {
            offset=pos + 1;
            continue;
          }
          haystack=haystack.substring(0,pos) + replace + haystack.substring(pos + needle.length());
        }
     else     break;
      }
      return haystack;
    }
}
