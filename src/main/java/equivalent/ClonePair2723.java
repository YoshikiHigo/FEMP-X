package equivalent;

public class ClonePair2723 {
    String method1(String base, String target, char separator) {
        try {
            String canonicalBase = base;
            if ((base.charAt(base.length() - 1) == '/') || (base.charAt(base.length() - 1) == '\\')) {
                canonicalBase = base.substring(0, base.length() - 1);
            }
            String canonicalTarget;
            canonicalTarget = target;
            if ((canonicalTarget.charAt(canonicalTarget.length() - 1) == '/') || (canonicalTarget.charAt(canonicalTarget.length() - 1) == '\\')) {
                canonicalTarget = canonicalTarget.substring(0, canonicalTarget.length() - 1);
            }
            if (canonicalTarget.equals(canonicalBase)) {
                return ".";
            }
            if (canonicalBase.startsWith("\\\\")) {
                final int endPrefix = canonicalBase.indexOf('\\', 2);
                final String prefix1 = canonicalBase.substring(0, endPrefix);
                final String prefix2 = canonicalTarget.substring(0, endPrefix);
                if (!prefix1.equals(prefix2)) {
                    return canonicalTarget;
                }
            } else {
                if (canonicalBase.startsWith(":\\", 1)) {
                    final int endPrefix = 2;
                    final String prefix1 = canonicalBase.substring(0, endPrefix);
                    final String prefix2 = canonicalTarget.substring(0, endPrefix);
                    if (!prefix1.equals(prefix2)) {
                        return canonicalTarget;
                    }
                } else {
                    if (canonicalBase.charAt(0) == '/') {
                        if (canonicalTarget.charAt(0) != '/') {
                            return canonicalTarget;
                        }
                    }
                }
            }
            int lastSeparator = -1;
            int minLength = canonicalBase.length();
            if (canonicalTarget.length() < minLength) {
                minLength = canonicalTarget.length();
            }
            int firstDifference = minLength + 1;
            for (int i = 0; i < minLength; i++) {
                if (canonicalTarget.charAt(i) == canonicalBase.charAt(i)) {
                    if ((canonicalTarget.charAt(i) == '/') || (canonicalTarget.charAt(i) == '\\')) {
                        lastSeparator = i;
                    }
                } else {
                    firstDifference = lastSeparator + 1;
                    break;
                }
            }
            final StringBuffer relativePath = new StringBuffer(50);
            if (canonicalBase.length() > firstDifference) {
                relativePath.append("..");
                for (int i = firstDifference; i < canonicalBase.length(); i++) {
                    if ((canonicalBase.charAt(i) == '/') || (canonicalBase.charAt(i) == '\\')) {
                        relativePath.append(separator);
                        relativePath.append("..");
                    }
                }
            }
            if (canonicalTarget.length() > firstDifference) {
                if (relativePath.length() > 0) {
                    relativePath.append(separator);
                }
                relativePath.append(canonicalTarget.substring(firstDifference));
            }
            return relativePath.toString();
        } catch (final Exception ex) {
        }
        return target;
    }

    String method2(String base, String target, char separator) {
        try {
            String canonicalBase = base;
            if (base.charAt(base.length() - 1) == '/' || base.charAt(base.length() - 1) == '\\') {
                canonicalBase = base.substring(0, base.length() - 1);
            }
            String canonicalTarget;
            canonicalTarget = target;
            if (canonicalTarget.charAt(canonicalTarget.length() - 1) == '/' || (canonicalTarget.charAt(canonicalTarget.length() - 1) == '\\')) {
                canonicalTarget = canonicalTarget.substring(0, canonicalTarget.length() - 1);
            }
            if (canonicalTarget.equals(canonicalBase)) {
                return ".";
            }
            if (canonicalBase.startsWith("\\\\")) {
                int endPrefix = canonicalBase.indexOf('\\', 2);
                String prefix1 = canonicalBase.substring(0, endPrefix);
                String prefix2 = canonicalTarget.substring(0, endPrefix);
                if (!prefix1.equals(prefix2)) {
                    return canonicalTarget;
                }
            } else {
                if (canonicalBase.startsWith(":\\", 1)) {
                    int endPrefix = 2;
                    String prefix1 = canonicalBase.substring(0, endPrefix);
                    String prefix2 = canonicalTarget.substring(0, endPrefix);
                    if (!prefix1.equals(prefix2)) {
                        return canonicalTarget;
                    }
                } else {
                    if (canonicalBase.charAt(0) == '/') {
                        if (canonicalTarget.charAt(0) != '/') {
                            return canonicalTarget;
                        }
                    }
                }
            }
            int lastSeparator = -1;
            int minLength = canonicalBase.length();
            if (canonicalTarget.length() < minLength) {
                minLength = canonicalTarget.length();
            }
            int firstDifference = minLength + 1;
            for (int i = 0; i < minLength; i++) {
                if (canonicalTarget.charAt(i) == canonicalBase.charAt(i)) {
                    if (canonicalTarget.charAt(i) == '/' || canonicalTarget.charAt(i) == '\\') {
                        lastSeparator = i;
                    }
                } else {
                    firstDifference = lastSeparator + 1;
                    break;
                }
            }
            StringBuffer relativePath = new StringBuffer(50);
            if (canonicalBase.length() > firstDifference) {
                relativePath.append("..");
                for (int i = firstDifference; i < canonicalBase.length(); i++) {
                    if (canonicalBase.charAt(i) == '/' || canonicalBase.charAt(i) == '\\') {
                        relativePath.append(separator);
                        relativePath.append("..");
                    }
                }
            }
            if (canonicalTarget.length() > firstDifference) {
                if (relativePath.length() > 0) {
                    relativePath.append(separator);
                }
                relativePath.append(canonicalTarget.substring(firstDifference));
            }
            return relativePath.toString();
        } catch (Exception ex) {
        }
        return target;
    }
}
