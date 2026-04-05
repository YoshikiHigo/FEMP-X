package unverified;

public class ClonePair10148 {

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

    String method2(String input,String oldString,String newString){
      String result=input;
      if (input != null && oldString != null && !"".equals(oldString)) {
        int newPosition=input.indexOf(oldString);
        if (newPosition != -1) {
          final StringBuilder builder=new StringBuilder();
          builder.append(input.substring(0,newPosition));
          builder.append(newString == null ? "" : newString);
          int oldPosition=newPosition + oldString.length();
          while ((newPosition=input.indexOf(oldString,oldPosition)) != -1) {
            builder.append(input.substring(oldPosition,newPosition));
            builder.append(newString == null ? "" : newString);
            oldPosition=newPosition + oldString.length();
          }
          builder.append(input.substring(oldPosition,input.length()));
          result=builder.toString();
        }
      }
      return result;
    }
}
