package all;

public class ClonePair10888 {

    String method1(String string,String oldString,String newString){
      if (string == null)   return null;
      if (newString == null)   return string;
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

    String method2(String orig,String vieja,String nueva){
      int oldind=0, newind=0;
      String retval="";
      if (orig == null)   return null;
      for (; ; ) {
        oldind=newind;
        newind=orig.indexOf(vieja,oldind);
        if (newind >= 0) {
          retval+=orig.substring(oldind,newind);
          retval+=nueva;
          newind+=vieja.length();
        }
     else {
          retval+=orig.substring(oldind);
          return retval;
        }
      }
    }
}
