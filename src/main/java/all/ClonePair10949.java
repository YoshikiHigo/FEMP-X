package all;

public class ClonePair10949 {

    String method1(String value,int length,String key){
      while (value.getBytes().length < length) {
        value+=key;
      }
      return value;
    }

    String method2(String str,int length,String padStr){
      if (str.length() >= length) {
        return str;
      }
      str=padStr + str;
      while (str.length() < length) {
        str+=(padStr + str);
      }
      return str;
    }
}
