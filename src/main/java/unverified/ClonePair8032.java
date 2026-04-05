package unverified;

public class ClonePair8032 {

    String method1(byte[] array,int offset,int length){
      String result="";
      for (int i=offset; i < (offset + length); ++i) {
        byte b=array[i];
        String currentHexString=Integer.toHexString(b & 0xFF);
        if (currentHexString.length() == 1)     currentHexString="0" + currentHexString;
        result+=currentHexString;
      }
      return result;
    }

    String method2(byte[] b,int i,int j){
      String temp="";
      for (int cntr=0; cntr < j; cntr++) {
        int num=b[i + cntr] & 0xFF;
        String myStr;
        if (num < 16)     myStr="0";
     else     myStr="";
        temp+=myStr + Integer.toHexString(num) + " ";
      }
      return temp.toUpperCase().trim();
    }
}
