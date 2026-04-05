package unverified;

public class ClonePair8449 {

    Double method1(String valueString){
      if (valueString == null || valueString.equals(""))   return null;
      try {
        return Double.parseDouble(valueString);
      }
     catch (  Exception e) {
        return null;
      }
    }

    Double method2(String s){
      if (s == null)   return null;
      Double rval=null;
      try {
        rval=new Double(s);
      }
     catch (  NumberFormatException e) {
        return null;
      }
      return rval;
    }
}
