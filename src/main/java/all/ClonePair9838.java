package all;

public class ClonePair9838 {

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

    String method2(String data,String oldS,String newS){
      if (data == null)   return null;
      if (oldS == null || newS == null)   return data;
      StringBuffer buf=new StringBuffer(data.length());
      int pos=-1;
      int i=0;
      while ((pos=data.indexOf(oldS,i)) != -1) {
        buf.append(data.substring(i,pos)).append(newS);
        i=pos + oldS.length();
      }
      buf.append(data.substring(i));
      return buf.toString();
    }
}
