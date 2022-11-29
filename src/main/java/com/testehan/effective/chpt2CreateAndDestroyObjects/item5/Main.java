package com.testehan.effective.chpt2CreateAndDestroyObjects.item5;

public class Main {

    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker(() -> new AsianLexicon());
        System.out.println(spellChecker.isValid("bla"));
    }
}
