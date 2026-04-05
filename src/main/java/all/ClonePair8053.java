package all;

public class ClonePair8053 {

    int method1(String[] leadNames,String leadName){
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

    int method2(String[] array,String str){
      if (str == null || array == null || array.length == 0) {
        return -1;
      }
      for (int i=0; i < array.length; i++) {
        if (str.equals(array[i])) {
          return i;
        }
      }
      return -1;
    }
}
