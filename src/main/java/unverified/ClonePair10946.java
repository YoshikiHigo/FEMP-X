package unverified;

public class ClonePair10946 {

    String method1(String value,int length,String key){
      while (value.getBytes().length < length) {
        value+=key;
      }
      return value;
    }

    String method2(String str,int newLength,String paddingString){
      if ((newLength <= str.length()) || (paddingString.length() == 0)) {
        return str;
      }
      StringBuffer buff=new StringBuffer(newLength);
      buff.append(str);
      int diff=newLength - str.length();
      while (diff > 0) {
        if (diff > paddingString.length()) {
          diff=paddingString.length();
        }
        buff.append(paddingString.substring(0,diff));
        diff=newLength - buff.length();
      }
      return buff.toString();
    }
}
