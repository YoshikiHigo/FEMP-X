package unverified;

public class ClonePair12147 {

    String method1(String input,String replace,String replacement){
      if (replace.equals(replacement))   return input;
      int idx;
      if ((idx=input.indexOf(replace)) == -1) {
        return input;
      }
      boolean finished=false;
      while (!finished) {
        StringBuffer returning=new StringBuffer();
        while (idx != -1) {
          returning.append(input.substring(0,idx));
          returning.append(replacement);
          input=input.substring(idx + replace.length());
          idx=input.indexOf(replace);
        }
        returning.append(input);
        input=returning.toString();
        if ((idx=returning.indexOf(replace)) == -1) {
          finished=true;
        }
      }
      return input;
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
