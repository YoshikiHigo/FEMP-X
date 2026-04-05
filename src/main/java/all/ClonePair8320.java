package all;

public class ClonePair8320 {

    boolean method1(String string1,String string2){
      try {
        System.out.println(string1 + " : " + string2);
        int beginning1=string1.indexOf(".");
        int beginning2=string2.indexOf(".");
        String temp1=string1.substring(0,beginning1);
        String temp2=string2.substring(0,beginning2);
        System.out.println("First Digit:  String1: " + temp1 + " String2: "+ temp2);
        if (Integer.parseInt(temp1) > Integer.parseInt(temp2)) {
          return true;
        }
     else     if (Integer.parseInt(temp1) == Integer.parseInt(temp2)) {
          temp1=string1.substring(beginning1 + 1,string1.length());
          temp2=string2.substring(beginning2 + 1,string2.length());
          System.out.println("Second Digit:  String1: " + temp1 + " String2: "+ temp2);
          if (Integer.parseInt(temp1) > Integer.parseInt(temp2)) {
            return true;
          }
     else       if (Integer.parseInt(temp1) == Integer.parseInt(temp2)) {
            return false;
          }
     else       return false;
        }
     else     return false;
      }
     catch (  Exception e) {
        e.printStackTrace();
      }
      int beginning1=string1.indexOf(".");
      String beginning1_string=string1.substring(beginning1 + 1,string1.length());
      int beginning2=string2.indexOf(".");
      String beginning2_string=string2.substring(beginning2 + 1,string2.length());
      String temp1=string1.substring(0,beginning1);
      String temp2=string2.substring(0,beginning2);
      if (Integer.parseInt(temp1) > Integer.parseInt(temp2)) {
        return true;
      }
     else   if (Integer.parseInt(temp1) == Integer.parseInt(temp2)) {
        int mid1=beginning1_string.indexOf(".");
        String mid1_string=string1.substring(mid1 + 1,string1.length());
        mid1_string=mid1_string.substring(mid1_string.indexOf(".") + 1,mid1_string.length());
        int mid2=beginning2_string.indexOf(".");
        String mid2_string=string2.substring(mid2 + 1,string2.length());
        mid2_string=mid2_string.substring(mid2_string.indexOf(".") + 1,mid2_string.length());
        temp1=beginning1_string.substring(0,mid1);
        temp2=beginning2_string.substring(0,mid2);
        if (Integer.parseInt(temp1) > Integer.parseInt(temp2)) {
          return true;
        }
     else     if (Integer.parseInt(temp1) == Integer.parseInt(temp2)) {
          if (Integer.parseInt(mid1_string) > Integer.parseInt(mid2_string)) {
            return true;
          }
     else       if (Integer.parseInt(mid1_string) == Integer.parseInt(mid2_string)) {
            return false;
          }
     else       return false;
        }
     else     return false;
      }
     else   return false;
    }

    boolean method2(String string1,String string2){
      int beginning1=string1.indexOf(".");
      String beginning1_string=string1.substring(beginning1 + 1,string1.length());
      int beginning2=string2.indexOf(".");
      String beginning2_string=string2.substring(beginning2 + 1,string2.length());
      String temp1=string1.substring(0,beginning1);
      String temp2=string2.substring(0,beginning2);
      if (Integer.parseInt(temp1) > Integer.parseInt(temp2)) {
        return true;
      }
     else   if (Integer.parseInt(temp1) == Integer.parseInt(temp2)) {
        int mid1=beginning1_string.indexOf(".");
        String mid1_string=string1.substring(mid1 + 1,string1.length());
        mid1_string=mid1_string.substring(mid1_string.indexOf(".") + 1,mid1_string.length());
        int mid2=beginning2_string.indexOf(".");
        String mid2_string=string2.substring(mid2 + 1,string2.length());
        mid2_string=mid2_string.substring(mid2_string.indexOf(".") + 1,mid2_string.length());
        temp1=beginning1_string.substring(0,mid1);
        temp2=beginning2_string.substring(0,mid2);
        if (Integer.parseInt(temp1) > Integer.parseInt(temp2)) {
          return true;
        }
     else     if (Integer.parseInt(temp1) == Integer.parseInt(temp2)) {
          if (Integer.parseInt(mid1_string) > Integer.parseInt(mid2_string)) {
            return true;
          }
     else       if (Integer.parseInt(mid1_string) == Integer.parseInt(mid2_string)) {
            return false;
          }
     else       return false;
        }
     else     return false;
      }
     else   return false;
    }
}
