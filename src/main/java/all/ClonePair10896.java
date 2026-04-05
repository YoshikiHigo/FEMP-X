package all;

public class ClonePair10896 {

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

    String method2(String errorMessage,String replaced,String included){
      if (replaced.equals(included))   return errorMessage;
      String message=new String(errorMessage);
      int index=0;
      while ((index=message.lastIndexOf(replaced)) != -1) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(message.substring(0,index > 0 ? index : 0));
        buffer.append(included);
        buffer.append(message.substring(index + replaced.length()));
        message=buffer.toString();
      }
      return message;
    }
}
