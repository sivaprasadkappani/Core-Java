package com.edlumens.corejava.using.library;

import org.apache.commons.lang3.StringUtils;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String str = "  A  p a c h e   ";

        System.out.println(StringUtils.deleteWhitespace(str)); // "Apache"
    }
}
