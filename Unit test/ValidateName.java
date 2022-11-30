package controller;

//import controller.PlaceOrderController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class ValidateName {
    private PlaceOrderController placeOrderController;

    @BeforeEach
    void setUp() {
        placeOrderController = new PlaceOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "Nguyen Hai Duong,true",
            "Nguyen Van A, true",
            "duongnh190044,false",
            "duongnh@!123,false",
            ",false",
    })
    public void test(String name, boolean trueVal) {
        boolean boolVal = placeOrderController.validateName(name);
        assertEquals(trueVal, boolVal);
    }
}

