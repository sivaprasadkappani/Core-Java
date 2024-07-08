package com.edlumens.corejava.using.library;

import org.apache.commons.lang3.StringUtils;

public class AbbreviateStrings {
    public static void main(String[] args) {
        String str = "Apache Commons Lang";

        System.out.println(StringUtils.abbreviate(str, 10)); // "Apache Co..."
        System.out.println(StringUtils.abbreviate(str, 15)); // "Apache Commo..."
    }
}
 