package org.vincenzo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.util.Date;

@Document(collection = "ESPERIMENTO1")
public class Soggetto {

    @Id
    private String id;

    @Indexed(unique = true)
    @Field(value = "CODE")
    private String code;

    @Field(value = "FULLNAME")
    private String fullName;

    @Field(value = "STARTERDATE")
    private Date starterDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getStarterDate() {
        return starterDate;
    }

    public void setStarterDate(Date starterDate) {
        this.starterDate = starterDate;
    }

    @Override
    public String toString() {
        return "Soggetto{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", fullName='" + fullName + '\'' +
                ", starterDate=" + starterDate +
                '}';
    }
}
