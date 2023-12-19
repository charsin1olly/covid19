package com.covid;

import java.time.LocalDate;
import java.util.List;
import com.google.common.collect.Lists;


public class Covid19Case {

    LocalDate date;
  
    String county;

    int numberOfCases;

    public Covid19Case(LocalDate date, String county, int numberOfCases) {
        this.date = date;
        this.county = county;
        this.numberOfCases = numberOfCases;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCounty() {
        return county;
    }

    public int getNumberOfCases() {
        return numberOfCases;
    }

}

class Covid19Statistics {

    public static List<Covid19Case> covid19Cases()
    {
        return Lists.newArrayList(
                new Covid19Case(LocalDate.of(2023, 6, 1), "Taipei", 2),
                new Covid19Case(LocalDate.of(2023, 6, 1), "Kaohsiung", 5),
                new Covid19Case(LocalDate.of(2023, 6, 1), "Taoyuan", 4),
                new Covid19Case(LocalDate.of(2023, 6, 1), "Keelung", 3),

                new Covid19Case(LocalDate.of(2023, 6, 2), "Taipei", 4),
                new Covid19Case(LocalDate.of(2023, 6, 2), "Kaohsiung", 2),
                new Covid19Case(LocalDate.of(2023, 6, 2), "Taoyuan", 1),
                new Covid19Case(LocalDate.of(2023, 6, 2), "Keelung", 7),

                new Covid19Case(LocalDate.of(2023, 6, 3), "Taipei", 5),
                new Covid19Case(LocalDate.of(2023, 6, 3), "Kaohsiung", 4),
                new Covid19Case(LocalDate.of(2023, 6, 3), "Taoyuan", 8),
                new Covid19Case(LocalDate.of(2023, 6, 3), "Keelung", 3),

                new Covid19Case(LocalDate.of(2023, 6, 4), "Taipei", 4),
                new Covid19Case(LocalDate.of(2023, 6, 4), "Kaohsiung", 1),
                new Covid19Case(LocalDate.of(2023, 6, 4), "Taoyuan", 1),
                new Covid19Case(LocalDate.of(2023, 6, 4), "Keelung", 2),
        
                new Covid19Case(LocalDate.of(2023, 7, 1), "Taipei", 1),
                new Covid19Case(LocalDate.of(2023, 7, 1), "Kaohsiung", 2),
                new Covid19Case(LocalDate.of(2023, 7, 1), "Taoyuan", 2),
                new Covid19Case(LocalDate.of(2023, 7, 1), "Keelung", 1),

                new Covid19Case(LocalDate.of(2023, 7, 2), "Taipei", 3),
                new Covid19Case(LocalDate.of(2023, 7, 2), "Kaohsiung", 4),
                new Covid19Case(LocalDate.of(2023, 7, 2), "Taoyuan", 2),
                new Covid19Case(LocalDate.of(2023, 7, 2), "Keelung", 4),

                new Covid19Case(LocalDate.of(2023, 7, 3), "Taipei", 2),
                new Covid19Case(LocalDate.of(2023, 7, 3), "Kaohsiung", 1),
                new Covid19Case(LocalDate.of(2023, 7, 3), "Taoyuan", 1),
                new Covid19Case(LocalDate.of(2023, 7, 3), "Keelung", 9),

                new Covid19Case(LocalDate.of(2023, 7, 4), "Taipei", 3),
                new Covid19Case(LocalDate.of(2023, 7, 4), "Kaohsiung", 5),
                new Covid19Case(LocalDate.of(2023, 7, 4), "Taoyuan", 3),
                new Covid19Case(LocalDate.of(2023, 7, 4), "Keelung", 1)
        );
    }
}


