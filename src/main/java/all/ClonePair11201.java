package all;

public class ClonePair11201 {

    String method1(String prefix,String target){
      char c=target.charAt(0);
      if (c > 96 && c < 123)   c=(char)(c - 32);
      return new StringBuilder(prefix.length() + target.length()).append(prefix).append(c).append(target,1,target.length()).toString();
    }

    String method2(String prefix,String fieldName){
      char f=fieldName.charAt(0);
      if (f >= 'a' && f <= 'z') {
        f=(char)(f - 32);
      }
      return new StringBuffer(prefix).append(f).append(fieldName.substring(1)).toString();
    }
}
