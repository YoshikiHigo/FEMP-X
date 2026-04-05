package all;

public class ClonePair11808 {

    String method1(String string,String oldString,String newString){
      if (string == null) {
        return null;
      }
      int i=0;
      if ((i=string.indexOf(oldString,i)) >= 0) {
        char[] string2=string.toCharArray();
        char[] newString2=newString.toCharArray();
        int oLength=oldString.length();
        StringBuilder buf=new StringBuilder(string2.length);
        buf.append(string2,0,i).append(newString2);
        i+=oLength;
        int j=i;
        while ((i=string.indexOf(oldString,i)) > 0) {
          buf.append(string2,j,i - j).append(newString2);
          i+=oLength;
          j=i;
        }
        buf.append(string2,j,string2.length - j);
        return buf.toString();
      }
      return string;
    }

    String method2(String original,String replace,String with){
      if (original == null) {
        return original;
      }
      final int len=replace.length();
      StringBuffer sb=new StringBuffer(original.length());
      int start=0;
      int found=-1;
      while ((found=original.indexOf(replace,start)) != -1) {
        sb.append(original.substring(start,found));
        sb.append(with);
        start=found + len;
      }
      sb.append(original.substring(start));
      return sb.toString();
    }
}
