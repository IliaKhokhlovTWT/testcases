package it.twt.page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class TabDashboard {
    public void openPageCircuitiProgetto() {
        $x("//span[normalize-space()='Fibra - xDSL']").shouldBe(visible);
        $x("//span[normalize-space()='Fibra - xDSL']").click();
        $x("//span[normalize-space()='Circuiti a progetto']").shouldBe(visible);
        $x("//span[normalize-space()='Circuiti a progetto']").click();
        $x("//a[@ng-click=\"$state.go('app.fiber_act.anagrafica', {'type' : 'fibra'});\"]").shouldBe(visible);
        $x("//a[@ng-click=\"$state.go('app.fiber_act.anagrafica', {'type' : 'fibra'});\"]").click();
    }
}
