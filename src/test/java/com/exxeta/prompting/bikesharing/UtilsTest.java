package com.exxeta.prompting.bikesharing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class UtilsTest {

    @Test
    public void shouldReturnTrueWhenBikeIsRentable() {
        // given
        var bike = new Bike();
        var utils = new Utils();
        // when
        var result = utils.bikeIsRentable(bike);
        // then
        assertTrue(result);
    }
    
    @Test

}
