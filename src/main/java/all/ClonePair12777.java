package all;

public class ClonePair12777 {

    String method1(String src,String ori,String tar){
      String result=null;
      if (src != null && ori != null && tar != null) {
        try {
          StringBuffer source=new StringBuffer(src);
          int appearedIndex=0;
          int oriLength=ori.length();
          int tarLength=tar.length();
          int byPassingIndex=0;
          while (source.indexOf(ori,byPassingIndex) != -1) {
            appearedIndex=source.indexOf(ori,byPassingIndex);
            if (ori.equals(source.substring(appearedIndex,appearedIndex + oriLength))) {
              source=source.replace(appearedIndex,appearedIndex + oriLength,tar);
              byPassingIndex=appearedIndex + tarLength;
            }
     else {
              byPassingIndex=appearedIndex;
            }
          }
          result=source.toString();
        }
     catch (    Exception e) {
          e.printStackTrace();
        }
      }
      return result;
    }

    String method2(String source,String oldtext,String newtext){
      if (source == null || oldtext == null || newtext == null)   return null;
      String temp1=source;
      String temp="";
      for (int index=temp1.indexOf(oldtext); index >= 0; index=temp1.indexOf(oldtext)) {
        temp=String.valueOf(String.valueOf((new StringBuffer(String.valueOf(String.valueOf(temp)))).append(temp1.substring(0,index)).append(newtext)));
        temp1=temp1.substring(index + oldtext.length(),temp1.length());
      }
      temp=String.valueOf(temp) + String.valueOf(temp1);
      return temp;
    }
}
