package unverified;

public class ClonePair11824 {

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

    String method2(String str,String oldToken,String newToken){
      if (str == null)   return str;
      StringBuilder result=new StringBuilder(str.length() + 100);
      int i=str.indexOf(oldToken);
      int startOfIndex=0;
      for (; i != -1; i=str.indexOf(oldToken,startOfIndex)) {
        result.append(str.substring(startOfIndex,i));
        result.append(newToken);
        startOfIndex=i + oldToken.length();
      }
      result.append(str.substring(startOfIndex,str.length()));
      return result.toString();
    }
}
