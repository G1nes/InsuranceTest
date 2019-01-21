package steps;

import io.qameta.allure.Step;
import org.junit.Assert;
import pages.BasePage;
import pages.OrderPage;


public class OrderSteps extends BasePage {
    OrderPage op = new OrderPage(BasePage.getDriver());
    @Step
    public void fillInsuredFields (String field, String value){
        field = field.toLowerCase();
        field = field.replaceAll("\\s+","");
        switch (field){
            case "фамилия" : fillField(op.lNameInsured,value);
            break;
            case "имя" : fillField(op.fNameInsured,value);
                break;
            case "датарождения": fillField(op.birthDateInsured, value);
                break;
            default:
                System.out.println("Введите корректное название поля в разделе \"Застрахованные\"");
                break;
        }
    }
    @Step
    public void fillInsurantFields (String field, String value){
        field = field.toLowerCase();
        field = field.replaceAll("\\s+","");
        op.checkBoxFemale.click();
        switch (field){
            case "фамилия" : fillField(op.sName,value);
                break;
            case "имя" : fillField(op.fName,value);
                break;
            case "отчество" : fillField(op.mName,value);
                break;
            case "датарождения": fillField(op.birthDate, value);
                break;
            case "серияпаспорта" : fillField(op.idSeries,value);
                break;
            case "номерпаспорта": fillField(op.idNumber, value);
                break;
            case "датавыдачи" : fillField(op.issueDate,value);
                break;
            case "кемвыдан": fillField(op.issuePlace, value);
                break;

            default:
                System.out.println("Введите корректное название поля в разделе \"Страхователь\"");
        }
    }
    @Step
    public void selectContinueBtn(){
        op.sendBtn.click();
    }
    @Step
    public void checkErrorMessage(String value){
        Assert.assertEquals(value, op.errorMessage.getText());
        op = null;
    }
}
