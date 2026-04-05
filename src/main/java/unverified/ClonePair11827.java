package unverified;

public class ClonePair11827 {

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

    String method2(String str,String search,String replace){
      int start=0;
      int end=(str != null) ? str.indexOf(search) : -1;
      if (end == -1)   return str;
      StringBuffer buf=new StringBuffer(str.length());
      while (end != -1) {
        buf.append(str.substring(start,end));
        buf.append(replace);
        start=end + search.length();
        end=str.indexOf(search,start);
      }
      if (start != str.length()) {
        buf.append(str.substring(start));
      }
      return buf.toString();
    }
}
