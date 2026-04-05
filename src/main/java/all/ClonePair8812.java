package all;

public class ClonePair8812 {

    int method1(String location_str,int index_start){
      int index_end=index_start;
      while (index_end < location_str.length() && Character.isDigit(location_str.charAt(index_end)))   index_end++;
      return index_end;
    }

    int method2(String s,int i){
      int len=s.length();
      while (i < len && Character.isDigit(s.charAt(i))) {
        i++;
      }
      return i;
    }
}
