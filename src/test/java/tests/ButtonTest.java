package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class ButtonTest {

    @Test
    void testButtonClickAndReadMessage() {
        // 1. DemoQA elements sayfasını aç
        open("https://demoqa.com/elements");

        // 2. "Buttons" öğesine tıkla
        $("#item-4 > span").click();

        // 3. "Click Me" düğmesine tıkla
        $("button.btn.btn-primary:not(#rightClickBtn):not(#doubleClickBtn)").click();

        // 4. Görünen mesajı oku ve doğrula
        $("#dynamicClickMessage").shouldHave(Condition.text("You have done a dynamic click"));
    }


}

