package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TasteBase {


  @Test
  public void testContactCreationTests() {

    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("asd", "asd", "123", "123456"));
    app.getContactHelper().saveContact();
    app.getContactHelper().returnToHomePage();
  }
}
