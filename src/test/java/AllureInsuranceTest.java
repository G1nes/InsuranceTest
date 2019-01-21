import org.junit.Test;
import pages.BasePage;
import steps.*;

public class AllureInsuranceTest extends BasePage {
    @Test
    public void AllureInsuranceTest(){
        MainSteps ms = new MainSteps();
        InsuranceTypeSteps its = new InsuranceTypeSteps();
        CalculatorSteps cs = new CalculatorSteps();
        OrderSteps os = new OrderSteps();

        ms.selectMenuItem("Страхование");
        ms.selectSubMenuItem("Путешествия и покупки");

        its.checkTitle("Страхование путешественников");
        its.selectIssueOnlineBtn();
        its.selectNextTab();

        cs.selectCheckBox();
        cs.selectIssueBtn();

        //Вводим данные застрахованного

        os.fillInsuredFields("Фамилия", "Kurumov");
        os.fillInsuredFields("Имя","Deni");
        os.fillInsuredFields("Дата рождения", "01011992");

        //Вводим данные страхователя

        os.fillInsurantFields("Фамилия", "Курумова");
        os.fillInsurantFields("Имя","Мадина");
        os.fillInsurantFields("Отчество","НеЗнаю");
        os.fillInsurantFields("Дата рождения","01011998");
        os.fillInsurantFields("Серия паспорта","1234");
        os.fillInsurantFields("Номер Паспорта", "123456");
        os.fillInsurantFields("Дата выдачи","01011998");
        os.fillInsurantFields("Кем выдан","Washington");

        //Отправляем данные на валидацию

        os.selectContinueBtn();
        os.checkErrorMessage("Заполнены не все обязательные поля");
    }
}
