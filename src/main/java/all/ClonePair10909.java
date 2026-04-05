package all;

public class ClonePair10909 {

    String method1(String someString,int number,String fillString){
      if (someString.length() < number) {
        StringBuffer sb=new StringBuffer();
        sb.append(someString);
        int totalLength=someString.length();
        while (totalLength < number) {
          sb.append(fillString);
          totalLength+=fillString.length();
        }
        return sb.toString();
      }
      return someString;
    }

    String method2(String value,int length,String key){
      while (value.getBytes().length < length) {
        value+=key;
      }
      return value;
    }
}
