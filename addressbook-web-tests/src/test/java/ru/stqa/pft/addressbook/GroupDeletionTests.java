package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupDeletionTests extends TasteBae {


  @Test
  public void GroupDeletionTest() {
    gotoGroupPage();
    wd.get("http://localhost/addressbook/group.php");
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
