package qa.demo.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import qa.demo.pages.components.CalendarComponent;
import qa.demo.pages.components.GenderComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static qa.demo.testData.TestData.*;

public class RegistrationPage {
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName").setValue(firstName),
            lastNameInput = $("#lastName").setValue(lastName),
            emailInput = $("#userEmail").setValue(email),
            numberInput = $("#userNumber").setValue(number),
            subjectSelect = $("#subjectsContainer"),
            subjectInput = $("#subjectsInput").setValue(subject);

    GenderComponent genderComponent = new GenderComponent();
    CalendarComponent calendarComponent = new CalendarComponent();

    public void checkHeader() {
        formTitle.shouldHave(text(textOfHeader));
    }

    public void inputFirstName(String value) {
        firstNameInput.setValue(value);
    }

    public void inputLastName(String value) {
        lastNameInput.setValue(value);
    }

    public void inputEmail(String value) {
        emailInput.setValue(value);
    }

    public void selectGender() {
        genderComponent.selectGender();
    }

    public void inputNumber(String value) {
        numberInput.setValue(value);
    }

    public void setDateOfBirthday() {
        calendarComponent.setBirthdayDate();
    }

}
