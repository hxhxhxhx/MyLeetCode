package com.huaxiti.DesignModle.Direct2;

public class Product {
    private String buildA = "汉堡";
    private String buildB = "薯条";
    private String buildC = "可乐";
    private String buildD = "甜点";

    @Override
    public String toString() {
        return "Product{" +
                "buildA='" + buildA + '\'' +
                ", buildB='" + buildB + '\'' +
                ", buildC='" + buildC + '\'' +
                ", buildD='" + buildD + '\'' +
                '}';
    }

    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    public String getBuildD() {
        return buildD;
    }

    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }
}
