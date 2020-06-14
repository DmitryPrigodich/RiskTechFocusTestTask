package stepdefs;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import cucumber.api.java.en.And;
import lv.ctco.cukes.core.facade.VariableFacade;

@Singleton
public class StepDefBasic {

    @Inject
    private VariableFacade variableFacade;

    @And("^variable \"([^\"]+)\" is current timestamp$")
    public void createVariableSetToCurrentTimestamp(String varName) {
        this.variableFacade.setCurrentTimestampToVariable(varName);
    }
}