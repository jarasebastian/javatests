package com.platzi.javatests.util;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static com.platzi.javatests.util.DateUtil.isLeapYear;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class DateUtilLeapYearShould {

    /*
        -All the years divisible by 400 are leap years (1600, 2000, 2400)
        -Every year divisible by 100 but NOT by 400 are NOT leap years (1700, 1800, 1900)
        -All years divisible by 4 are leap years (1996, 2004, 2012)
        -   All years that are NOT divisible by 4 are NOT leap years (2017, 2018, 2019)
     */

    @Test
    public void return_true_when_year_is_divisible_by_400() {

        assertThat(isLeapYear(1600), is(true));
        assertThat(isLeapYear(2000), is(true));
        assertThat(isLeapYear(2400), is(true));
    }

    @Test
    public void return_false_when_year_is_divisible_by_100_but_not_by_400(){

        assertThat(isLeapYear(1700), is(false));
        assertThat(isLeapYear(1800), is(false));
        assertThat(isLeapYear(1900), is(false));
    }

    @Test
    public void return_true_when_year_is_divisible_by_4_but_not_by_100() {

        assertThat(isLeapYear(1996), is(true));
        assertThat(isLeapYear(2004), is(true));
        assertThat(isLeapYear(2012), is(true));
    }

    @Test
    public void return_false_when_year_is_not_divisible_by_4(){

        assertThat(isLeapYear(2017), is(false));
        assertThat(isLeapYear(2018), is(false));
        assertThat(isLeapYear(2019), is(false));
    }

}