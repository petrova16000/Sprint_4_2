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
    Boolean expected;

    public AccountTest(String name, Boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Test
    public void checkNameToEmboss() {
        account = new Account(name);
        Assert.assertEquals(expected, account.checkNameToEmboss());
    }

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][]{
                {"B B", true},
                {"BL R", true},
                {"GREY TREYUIOLKJHYU", true},
                {"GREY TREYUIOLKJHYUW", true},
                {"BB", false},
                {"BBB", false},
                {" BLR", false},
                {"GREY UIO LKJHYU", false},
                {"GREYTREYUIOLKJHYU ", false},
                {"GREY TREYUIOLKJHYUW1", false}
        };
    }
}