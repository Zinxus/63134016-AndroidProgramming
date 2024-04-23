package com.example.usingrecyclerview;

public class LandScape {
    String landInageFileName;
    String landCation;

    public LandScape(String landInageFileName, String landCation) {
        this.landInageFileName = landInageFileName;
        this.landCation = landCation;
    }

    public String getLandInageFileName() {
        return landInageFileName;
    }

    public void setLandInageFileName(String landInageFileName) {
        this.landInageFileName = landInageFileName;
    }

    public String getLandCation() {
        return landCation;
    }

    public void setLandCation(String landCation) {
        this.landCation = landCation;
    }
}
