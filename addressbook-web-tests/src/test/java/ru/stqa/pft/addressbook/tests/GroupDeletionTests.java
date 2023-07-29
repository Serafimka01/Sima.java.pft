package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TasteBase {


  @Test
  public void GroupDeletionTest() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
