package org.vincenzo.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class SoggettoDTO {

    private String code;
    private String fullname;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate starterDate;

    public LocalDate getStarterDate() {
        return starterDate;
    }

    public void setStarterDate(LocalDate starterDate) {
        this.starterDate = starterDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}


