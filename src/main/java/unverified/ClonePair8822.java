package unverified;

public class ClonePair8822 {

    int method1(String location_str,int index_start){
      int index_end=index_start;
      while (index_end < location_str.length() && Character.isDigit(location_str.charAt(index_end)))   index_end++;
      return index_end;
    }

    int method2(String str,int startAt){
      int i;
      for (i=startAt; i < str.length(); ++i)   if (Character.isDigit(str.charAt(i)) == false)   break;
      return i;
    }
}
