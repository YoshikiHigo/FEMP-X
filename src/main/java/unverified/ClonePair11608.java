package unverified;

public class ClonePair11608 {

    String method1(String input,String oldString,String newString){
      if (input == null || input.length() == 0 || input.indexOf(oldString,0) < 0) {
        return input;
      }
     else {
        int i=0;
        int j=0;
        int oldLength=oldString.length();
        StringBuffer buffer=new StringBuffer();
        while ((i=input.indexOf(oldString,i)) >= 0) {
          buffer.append(input.substring(j,i)).append(newString);
          j=(i+=oldLength);
        }
        input=buffer.append(input.substring(j)).toString();
        buffer=null;
        return input;
      }
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
