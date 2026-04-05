package all;

public class ClonePair8051 {

    int method1(String[] list,String str){
      int pos=-1;
      if (list != null && list.length > 0) {
        for (int i=0; i < list.length; i++) {
          if (list[i] != null && list[i].equals(str)) {
            pos=i;
            break;
          }
        }
      }
      return pos;
    }

    int method2(String[] leadNames,String leadName){
      if (leadNames != null && leadName != null) {
        String upperCaseLeadName=leadName.toUpperCase();
        for (int i=0; i < leadNames.length; ++i) {
          if (leadNames[i] != null && leadNames[i].toUpperCase().equals(upperCaseLeadName)) {
            return i;
          }
        }
      }
      return -1;
    }
}
