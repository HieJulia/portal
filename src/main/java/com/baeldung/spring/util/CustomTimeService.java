package com.baeldung.spring.util;


import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myTimeService")
@Scope("singleton")
public class CustomTimeService {

    private Date date = new Date();

    public CustomTimeService() {
    }

    public CustomTimeService(Date date) {
        super();
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MyTimeService [date=" + date + "]";
    }

}
