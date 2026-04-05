package unverified;

public class ClonePair11804 {

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

    String method2(String s,String find,String replace){
      if (s == null)   return s;
      StringBuffer result=new StringBuffer();
      int index;
      while ((index=s.indexOf(find)) >= 0) {
        result.append(s.substring(0,index));
        result.append(replace);
        s=s.substring(index + find.length());
      }
      result.append(s);
      return result.toString();
    }
}
