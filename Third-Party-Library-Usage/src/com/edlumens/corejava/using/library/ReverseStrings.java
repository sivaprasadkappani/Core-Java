package com.edlumens.corejava.using.library;

import org.apache.commons.lang3.StringUtils;

public class ReverseStrings {
    public static void main(String[] args) {
        String str = "Apache";

        System.out.println(StringUtils.reverse(str)); // "ehcapA"
    }
}