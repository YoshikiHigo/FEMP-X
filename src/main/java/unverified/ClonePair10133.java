package unverified;

public class ClonePair10133 {

    String method1(String str,String find,String replace){
      if (str == null)   return null;
      if ((find == null) || (find.length() == 0))   return str;
      if (replace == null)   replace="";
      StringBuffer sb=new StringBuffer(str.length());
      int pos=0;
      int lastPos=0;
      while (pos >= 0) {
        pos=str.indexOf(find,lastPos);
        if (pos >= 0) {
          sb.append(str.substring(lastPos,pos));
          sb.append(replace);
        }
     else {
          sb.append(str.substring(lastPos));
        }
        lastPos=pos + find.length();
      }
      return sb.toString();
    }

    String method2(String orig,String find,String replace){
      if (find == null || find.equals("")) {
        return orig;
      }
      if (replace == null) {
        replace="";
      }
      if (orig == null) {
        return null;
      }
      int origLength=orig.length();
      int findLength=find.length();
      StringBuffer replaced=new StringBuffer((int)(origLength * 2));
      int lastIndex=0;
      int indexOf=orig.indexOf(find,lastIndex);
      while (indexOf > -1) {
        replaced.append(orig.substring(lastIndex,indexOf));
        replaced.append(replace);
        lastIndex=indexOf + findLength;
        indexOf=orig.indexOf(find,lastIndex);
      }
      if (lastIndex < origLength) {
        replaced.append(orig.substring(lastIndex,origLength));
      }
      return replaced.toString();
    }
}
