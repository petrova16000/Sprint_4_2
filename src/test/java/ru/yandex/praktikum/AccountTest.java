package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class AccountTest {

    Account account;
    String name;

    public AccountTest(String name) {
        this.name = name;
    }

    @Test
    public void checkNameToEmboss() {
        account = new Account(name);
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][]{
                {"B B"},
                {"BL R"},
                {"GREY TREYUIOLKJHYU"},
                {"GREY TREYUIOLKJHYUW"}
        };
    }

}