package all;

public class ClonePair11400 {

    String method1(String source,String target,String replace,int limit){
      String result=source;
      int len=target.length();
      int pos=result.indexOf(target);
      int count=0;
      while ((pos >= 0) && ((limit <= 0) || (count < limit))) {
        result=result.substring(0,pos) + replace + result.substring(pos + len,result.length());
        count++;
        pos=result.indexOf(target,pos + replace.length());
      }
      return (result);
    }

    String method2(String str,String variable,String value,int num){
      int subsLeftToPreform=num;
      StringBuffer buf=new StringBuffer(str);
      int ind=str.indexOf(variable);
      while (ind >= 0 && subsLeftToPreform-- != 0) {
        buf.replace(ind,ind + variable.length(),value);
        ind=buf.toString().indexOf(variable);
      }
      return buf.toString();
    }
}
