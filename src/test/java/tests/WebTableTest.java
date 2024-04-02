package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class WebTableTest {

    @Test
    void testAddAndEditRecordInWebTable() {
        // 1. DemoQA webtables sayfasını aç
        open("https://demoqa.com/webtables");

        // 2. "ADD" düğmesine tıkla ve yeni kayıt ekle
        $("#addNewRecordButton").click();
        $("#firstName").setValue("John");
        $("#lastName").setValue("Doe");
        $("#userEmail").setValue("johndoe@example.com");
        $("#age").setValue("30");
        $("#salary").setValue("50000");
        $("#department").setValue("IT");
        $("#submit").click();

        // 3. Eklenen kaydı düzenle
        $("#edit-record-1").click();
        $("#firstName").setValue("Jane");
        $("#submit").click();

        // 4. Değişiklikleri kontrol et
        $("#searchBox").setValue("Jane").pressEnter();
    }
}
