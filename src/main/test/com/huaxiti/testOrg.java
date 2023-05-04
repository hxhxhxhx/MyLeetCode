package com.huaxiti;

import org.junit.Test;

public class testOrg {


    @Test
    public void test(){
        Organization1 organization1 = new Organization1();
        System.out.println(organization1);
        Organization1 organization11 = organization1.setId("1");
        System.out.println(organization11);
        Organization1 organization12 = organization11.setOrgName("zzz");
        System.out.println(organization12);
    }
}
