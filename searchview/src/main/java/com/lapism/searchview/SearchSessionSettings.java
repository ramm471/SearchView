package com.lapism.searchview;

public class SearchSessionSettings {

    private static final SearchSessionSettings SETTINGS = new SearchSessionSettings();

    private boolean isShowed;

    private SearchSessionSettings() {
    }

    public static SearchSessionSettings getInstance() {
        return SETTINGS;
    }

    public boolean isShowed() {
        return isShowed;
    }

    public void setShowed(final boolean showed) {
        isShowed = showed;
    }
}
