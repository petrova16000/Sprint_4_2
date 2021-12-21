package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class AccountNegativeTest {

    Account account;
    String name;

    public AccountNegativeTest(String name) {
        this.name = name;
    }

    @Test
    public void checkNameToEmboss() {
        account = new Account(name);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][]{
                {"BB"},
                {"BBB"},
                {" BLR"},
                {"GREY UIO LKJHYU"},
                {"GREYTREYUIOLKJHYU "},
                {"GREY TREYUIOLKJHYUW1"}
        };
    }

}