package all;

public class ClonePair8823 {

    int method1(String location_str,int index_start){
      int index_end=index_start;
      while (index_end < location_str.length() && Character.isDigit(location_str.charAt(index_end)))   index_end++;
      return index_end;
    }

    int method2(String str,int i){
      for (int len=str.length(); i < len; i++) {
        if ("0123456789".indexOf(str.charAt(i)) < 0)     break;
      }
      return i;
    }
}
