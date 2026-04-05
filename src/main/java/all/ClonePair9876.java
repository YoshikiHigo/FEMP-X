package all;

public class ClonePair9876 {

    String method1(String input,String search,String replace){
      if (input == null || search == null) {
        return input;
      }
      if (replace == null) {
        replace="";
      }
      int index=input.indexOf(search);
      if (index == -1) {
        return input;
      }
      StringBuffer out=new StringBuffer();
      int afterPrev=0;
      while (index != -1) {
        out.append(input.substring(afterPrev,index));
        out.append(replace);
        afterPrev=index + search.length();
        index=input.indexOf(search,afterPrev);
      }
      out.append(input.substring(afterPrev));
      return out.toString();
    }

    String method2(String s,String f,String r){
      if (s == null)   return s;
      if (f == null)   return s;
      if (r == null)   r="";
      int index01=s.indexOf(f);
      while (index01 != -1) {
        s=s.substring(0,index01) + r + s.substring(index01 + f.length());
        index01+=r.length();
        index01=s.indexOf(f,index01);
      }
      return s;
    }
}
