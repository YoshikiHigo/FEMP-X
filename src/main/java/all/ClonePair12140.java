package all;

public class ClonePair12140 {

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

    String method2(String source,String oldString,String newString){
      if (source == null)   return null;
      StringBuffer output=new StringBuffer();
      int lengOfsource=source.length();
      int lengOfold=oldString.length();
      int posStart=0;
      int pos;
      while ((pos=source.indexOf(oldString,posStart)) >= 0) {
        output.append(source.substring(posStart,pos));
        output.append(newString);
        posStart=pos + lengOfold;
      }
      if (posStart < lengOfsource) {
        output.append(source.substring(posStart));
      }
      return output.toString();
    }
}
