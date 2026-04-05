package unverified;

public class ClonePair11132 {

    String method1(String str,String from,String to){
      if (str == null)   return str;
      int index=str.indexOf(from);
      if (index == -1)   return str;
      int pos=0;
      final int fromLen=from.length();
      final StringBuilder sb=new StringBuilder();
      while (index > -1) {
        sb.append(str.substring(pos,index)).append(to);
        pos=index + fromLen;
        index=str.indexOf(from,pos);
      }
      sb.append(str.substring(pos));
      return sb.toString();
    }

    String method2(String string,String oldString,String newString){
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
}
