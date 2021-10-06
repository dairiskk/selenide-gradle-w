package pageObjects;

import com.codeborne.selenide.Selenide;

public class MultipleSortingHomePage {


    public MultipleSortingHomePage openHomePage() {
        Selenide.open("https://js.devexpress.com/Demos/WidgetsGallery/Demo/TreeList/MultipleSorting/");
        return this;
    }
}
