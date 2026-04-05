package all;

public class ClonePair11813 {

    String method1(String src,int length){
      if (src.length() <= length) {
        return src;
      }
     else {
        String tmp=src.substring(0,length);
        tmp=tmp + "...";
        return tmp;
      }
    }

    String method2(String x,int n){
      x=x.replace('\n','|');
      if (x.length() > n) {
        StringBuilder item=new StringBuilder(x.substring(0,n));
        item.append("...");
        return item.toString();
      }
     else {
        return x;
      }
    }
}
