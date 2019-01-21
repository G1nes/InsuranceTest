import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import pages.*;

public class PageObjectInsuranceTest extends BasePage {

    @Test
    @Ignore
    public void sendRequest (){
        MainPage mp = new MainPage(getDriver());
        InsuranceTypePage itp = new InsuranceTypePage(getDriver());
        CalculatorPage cp = new CalculatorPage(getDriver());
        OrderPage op = new OrderPage(getDriver());

        mp.selectMenuItem("Страхование");
        mp.selectSubMenu("Путешествия и покупки");
        Assert.assertEquals("Страхование путешественников",itp.travellerInsurance.getText());
        itp.travellerInsurance.click();
        itp.issueOnline.click();
        itp.selectNextTab();
        cp.priceBox.click();
        cp.orderBtn.click();
        op.fillField(op.lNameInsured, "Kurumov");
        op.fillField(op.fNameInsured, "Deni");
        op.fillField(op.birthDateInsured, "01011992");

        op.fillField(op.sName, "Курумова");
        op.fillField(op.fName, "Мадина");
        op.fillField(op.mName, "Не знаю");
        op.checkBoxFemale.click();
        op.fillField(op.birthDate, "01011992");
        op.fillField(op.idSeries, "0101");
        op.fillField(op.idNumber, "010101");
        op.fillField(op.issueDate, "01011992");
        op.fillField(op.issuePlace, "Washington");
        op.sendBtn.click();
        Assert.assertEquals("Заполнены не все обязательные поля", op.errorMessage.getText());
    }
}
