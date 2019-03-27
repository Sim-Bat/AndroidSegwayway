package com.mapquest.navigation.sampleapp.routesettings;

public enum NavigationLanguage {
    FRENCH_FR("fr"),
    ENGLISH_US("en_US");

    NavigationLanguage(String languageCode) {
        mLanguageCode = languageCode;
    }
    public String getLanguageCode() {
        return mLanguageCode;
    }

    private String mLanguageCode;
}
