package unverified;

public class ClonePair11609 {

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
