package step_definitions;

import com.google.gson.internal.$Gson$Preconditions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.Dashboard;
import pages.Privathaftpflicht;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_003 {
    Dashboard dashboard=new Dashboard();
    Privathaftpflicht privathaftpflicht=new Privathaftpflicht();

    @When("the user click {string} button")
    public void the_user_click_button(String string) {


    }

    @And("the user see the 1st question of questionnaire")
    public void the_user_see_the_1st_question_of_questionnaire() {

    }

    @And("the user see the 2nd question of questionnaire")
    public void the_user_see_the_2nd_question_of_questionnaire() {
    }

    @And("the user see the {int}rd question of questionnaire")
    public void theUserSeeTheRdQuestionOfQuestionnaire(int arg0) {

    }

    @And("the user see the {int}th question of questionnaire")
    public void theUserSeeTheThQuestionOfQuestionnaire(int arg0) {
    }
}

