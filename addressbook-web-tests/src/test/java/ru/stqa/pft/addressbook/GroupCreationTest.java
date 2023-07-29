package ru.stqa.pft.addressbook;

import org.openqa.selenium.*;
import org.testng.annotations.*;


public class GroupCreationTest extends TasteBae {

  @Test
  public void testGroupCreation () {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
    wd.findElement(By.linkText("Logout")).click();

  }

}
