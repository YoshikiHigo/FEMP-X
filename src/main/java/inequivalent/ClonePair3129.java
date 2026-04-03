package inequivalent;

import java.util.Locale;

public class ClonePair3129 {

    Locale method1(String str) {
        if (str == null) {
            return null;
        }
        int len = str.length();
        if (len != 2 && len != 5 && len < 7) {
            return null;
        }
        char ch0 = str.charAt(0);
        char ch1 = str.charAt(1);
        if (ch0 < 'a' || ch0 > 'z' || ch1 < 'a' || ch1 > 'z') {
            return null;
        }
        if (len == 2) {
            return new Locale(str, "");
        }
        if (str.charAt(2) != '_') {
            return null;
        }
        char ch3 = str.charAt(3);
        char ch4 = str.charAt(4);
        if (ch3 < 'A' || ch3 > 'Z' || ch4 < 'A' || ch4 > 'Z') {
            return null;
        }
        if (len == 5) {
            return new Locale(str.substring(0, 2), str.substring(3, 5));
        }
        if (str.charAt(5) != '_') {
            return null;
        }
        return new Locale(str.substring(0, 2), str.substring(3, 5), str.substring(6));
    }

    Locale method2(String input) {
        if (input == null) {
            return null;
        }
        int len = input.length();
        if (len != 2 && len != 5 && len < 7) {
            return null;
        }
        char ch0 = input.charAt(0);
        char ch1 = input.charAt(1);
        if (ch0 < 'a' || ch0 > 'z' || ch1 < 'a' || ch1 > 'z') {
            return null;
        }
        if (len == 2) {
            return new Locale(input, "");
        }
        if (input.charAt(2) != '_') {
            return null;
        }
        char ch3 = input.charAt(3);
        if (ch3 == '_') {
            return new Locale(input.substring(0, 2), "", input.substring(4));
        }
        char ch4 = input.charAt(4);
        if (ch3 < 'A' || ch3 > 'Z' || ch4 < 'A' || ch4 > 'Z') {
            return null;
        }
        if (len == 5) {
            return new Locale(input.substring(0, 2), input.substring(3, 5));
        }
        if (input.charAt(5) != '_') {
            return null;
        }
        return new Locale(input.substring(0, 2), input.substring(3, 5), input.substring(6));
    }
}
