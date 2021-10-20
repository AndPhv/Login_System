package com.company;

import java.util.HashMap;

public class IDandPassword
{
    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPassword()
    {
        logininfo.put("Andrey", "qwerty");
        logininfo.put("java", "123");
        logininfo.put("andphv", "000000");
    }
    protected HashMap getLoginInfo()
    {
        return logininfo;
    }

}
