package com.nbsp.materialfilepicker.utils;

import java.util.regex.Pattern;

/**
 * @author mac
 * @title FileTypePatternUtils
 * @description 提供文件类型正则
 * @modifier
 * @date
 * @since 16/7/18 18:04
 **/
public class FileTPatternUtils {

    public static String[] CERTIFICATE = {"cer", "der", "pfx", "p12", "arm", "pem"};
    public static String[] DRAWING = {"ai", "cdr", "dfx", "eps", "svg", "stl", "wmf", "emf", "art", "xar"};
    public static String[] EXCEL = {"xls", "xlk", "xlsb", "xlsm", "xlsx", "xlr", "xltm", "xlw", "numbers", "ods", "ots"};
    public static String[] IMAGE = {"bmp", "gif", "ico", "jpeg", "jpg", "pcx", "png", "psd", "tga", "tiff", "tif", "xcf"};
    public static String[] MUSIC = {"aiff", "aif", "wav", "flac", "m4a", "wma", "amr", "mp2", "mp3", "wma", "aac", "mid", "m3u"};
    public static String[] VIDEO = {"avi", "mov", "wmv", "mkv", "3gp", "f4v", "flv", "mp4", "mpeg", "webm"};
    public static String[] PDF = {"pdf"};
    public static String[] POWER_POINT = {"pptx", "keynote", "ppt", "pps", "pot", "odp", "otp"};
    public static String[] WORD = {"doc", "docm", "docx", "dot", "mcw", "rtf", "pages", "odt", "ott"};
    public static String[] ARCHIVE = {"cab", "7z", "alz", "arj", "bzip2", "bz2", "dmg", "gzip", "gz", "jar", "lz", "lzip", "lzma", "zip", "rar", "tar", "tgz"};
    public static String[] APK = {"apk"};

    public static Pattern makePattern(String[] src) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : src) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append("|");
            }
            stringBuffer.append(".*\\.");
            stringBuffer.append(str);
        }
        return Pattern.compile(stringBuffer.toString());
    }

    public static Pattern CERTIFICATEPattern() {
        return makePattern(CERTIFICATE);
    }

    public static Pattern DRAWINGPattern() {
        return makePattern(DRAWING);
    }

    public static Pattern EXCELPattern() {
        return makePattern(EXCEL);
    }

    public static Pattern IMAGEPattern() {
        return makePattern(IMAGE);
    }

    public static Pattern MUSICPattern() {
        return makePattern(MUSIC);
    }

    public static Pattern VIDEOPattern() {
        return makePattern(VIDEO);
    }

    public static Pattern PDFPattern() {
        return makePattern(PDF);
    }

    public static Pattern POWER_POINTPattern() {
        return makePattern(POWER_POINT);
    }

    public static Pattern WORDPattern() {
        return makePattern(WORD);
    }

    public static Pattern ARCHIVEPattern() {
        return makePattern(ARCHIVE);
    }

    public static Pattern APKPattern() {
        return makePattern(APK);
    }
}
