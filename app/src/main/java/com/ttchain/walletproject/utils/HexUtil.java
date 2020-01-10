package com.ttchain.walletproject.utils;

public class HexUtil {
    public static String toHex(byte[] bytes) {
        if (bytes == null) {
            return "";
        } else {
            char[] hexArray = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] hexChars = new char[bytes.length * 2];

            for(int j = 0; j < bytes.length; ++j) {
                int v = bytes[j] & 255;
                hexChars[j * 2] = hexArray[v >>> 4];
                hexChars[j * 2 + 1] = hexArray[v & 15];
            }

            return new String(hexChars);
        }
    }

    public static byte[] fromHex(String s) {
        if (s != null) {
            try {
                StringBuilder sb = new StringBuilder(s.length());

                int len;
                for(len = 0; len < s.length(); ++len) {
                    char ch = s.charAt(len);
                    if (!Character.isWhitespace(ch)) {
                        sb.append(ch);
                    }
                }

                s = sb.toString();
                len = s.length();
                byte[] data = new byte[len / 2];

                for(int i = 0; i < len; i += 2) {
                    int hi = Character.digit(s.charAt(i), 16) << 4;
                    int low = Character.digit(s.charAt(i + 1), 16);
                    if (hi >= 256 || low < 0 || low >= 16) {
                        return null;
                    }

                    data[i / 2] = (byte)(hi | low);
                }

                return data;
            } catch (Exception var7) {
            }
        }

        return null;
    }
}
