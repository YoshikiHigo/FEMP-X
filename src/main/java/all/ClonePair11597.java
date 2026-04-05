package all;

public class ClonePair11597 {

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

    String method2(String source,String toReplace,String replacement){
      if (source != null && source.indexOf(toReplace) != -1) {
        StringBuffer sb=new StringBuffer();
        int ix=-1;
        while ((ix=source.indexOf(toReplace)) >= 0) {
          sb.append(source.substring(0,ix)).append(replacement);
          source=source.substring(ix + toReplace.length());
        }
        if (source.length() >= 1) {
          sb.append(source);
        }
        return sb.toString();
      }
      return source;
    }
}
