package all;

public class ClonePair11832 {

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

    @SuppressWarnings("unused") String method2(String strSource,String strFrom,String strTo){
      if (strSource == null) {
        return null;
      }
      int i=0;
      if ((i=strSource.indexOf(strFrom,i)) >= 0) {
        char[] cSrc=strSource.toCharArray();
        char[] cTo=strTo.toCharArray();
        int len=strFrom.length();
        StringBuffer buf=new StringBuffer(cSrc.length);
        buf.append(cSrc,0,i).append(cTo);
        i+=len;
        int j=i;
        while ((i=strSource.indexOf(strFrom,i)) > 0) {
          buf.append(cSrc,j,i - j).append(cTo);
          i+=len;
          j=i;
        }
        buf.append(cSrc,j,cSrc.length - j);
        return buf.toString();
      }
      return strSource;
    }
}
