package com.xp.sortrecyclerview;

public class SortModel implements Comparable<SortModel>{

    private String name;
    private String letters;//显示拼音的首字母

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    @Override
    public int compareTo(SortModel sortModel) {
        return this.letters.compareTo(sortModel.letters);
    }
}
