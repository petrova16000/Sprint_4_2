package ru.yandex.praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() >= 3 && name.length()  <= 19 && checkSpaces(name) && !name.endsWith(" ") && !name.startsWith(" ")){
            return true;
        } else return false;
    }

    private boolean checkSpaces(String value){
        int i = 0;
        int counter = 0;
        while (i < name.length()-1){
            if (name.charAt(i)==' '){
                counter += 1;
            }
            i++;
        }
        if (counter == 1) {
            return true;
        } else {
            return false;
        }
    }
}