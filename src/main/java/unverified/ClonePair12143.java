package unverified;

public class ClonePair12143 {

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

    String method2(String source,String target,String replacement){
      if (target.equals(replacement)) {
        return source;
      }
     else {
        StringBuffer result=new StringBuffer();
        int lastNdx=0;
        int ndx=source.indexOf(target);
        while (ndx >= 0) {
          result.append(source.substring(lastNdx,ndx));
          result.append(replacement);
          ndx+=target.length();
          lastNdx=ndx;
          ndx=source.indexOf(target,ndx);
        }
        result.append(source.substring(lastNdx));
        return result.toString();
      }
    }
}
