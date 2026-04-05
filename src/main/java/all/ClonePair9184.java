package all;

public class ClonePair9184 {

    int method1(String arg1,String arg0){
      if (arg0 == null && arg1 == null) {
        return 0;
      }
     else   if (arg0 == null) {
        return -1;
      }
     else   if (arg1 == null) {
        return 1;
      }
     else   if (arg0.length() < arg1.length()) {
        return -1;
      }
     else   if (arg0.length() > arg1.length()) {
        return 1;
      }
      return 0;
    }

    int method2(String o1,String o2){
      if (o1 == null) {
        return (o2 == null ? 0 : 1);
      }
      if (o2 == null) {
        return -1;
      }
      if (o1.length() == o2.length()) {
        return 0;
      }
      if (o1.length() < o2.length()) {
        return 1;
      }
      return -1;
    }
}
