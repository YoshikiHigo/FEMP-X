package all;

public class ClonePair12784 {

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

    String method2(String s,String oldSub,String newSub){
      if ((s == null) || (oldSub == null) || (newSub == null)) {
        return null;
      }
      int y=s.indexOf(oldSub);
      if (y >= 0) {
        StringBuffer sb=new StringBuffer();
        int length=oldSub.length();
        int x=0;
        while (x <= y) {
          sb.append(s.substring(x,y));
          sb.append(newSub);
          x=y + length;
          y=s.indexOf(oldSub,x);
        }
        sb.append(s.substring(x));
        return sb.toString();
      }
     else {
        return s;
      }
    }
}
