package tests;


import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.Application;


@Story(Application.TestAuth.Server.class)
@RunWith(ThucydidesRunner.class)
@Concurrent(threads = "1")

public class TestAuth extends BeforeClass {

    @ManagedPages(defaultUrl = "https://www.mowdirect.co.uk/")

    public Pages pages;

    @WithTag("Login successfully")
    @Test
    public void LoginSuccess()  {

        enterLogin.home();
        enterPass.login("mowdirect@gmail.com");
        enterPass.pass("123456");
        enterLogin.clickLogin();
        assertLocation.clickOnButton();
    }
    @WithTag("Check sale department")
    @Test
    public void SaleDepartment()  {

        details.details();
        showAll.showAll();
        assertTop.assertTop();
    }




}



