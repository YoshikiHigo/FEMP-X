package all;

public class ClonePair11818 {

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

    String method2(String string,String original,String newString){
      if (string == null)   return null;
      int i=string.indexOf(original);
      if (i < 0)   return string;
      StringBuffer sb=new StringBuffer(string);
      while (i >= 0) {
        int f=i + original.length();
        sb.replace(i,f,newString);
        i=sb.toString().indexOf(original,i + newString.length());
      }
      return sb.toString();
    }
}
