package com.edlumens.corejava.using.library;

import org.apache.commons.lang3.StringUtils;

public class PaddingAndAligning {
    public static void main(String[] args) {
        String str = "Apache";

        System.out.println(StringUtils.leftPad(str, 10, '*')); // "****Apache"
        System.out.println(StringUtils.rightPad(str, 10, '*')); // "Apache****"
        System.out.println(StringUtils.center(str, 10, '*')); // "**Apache**"
    }
}
