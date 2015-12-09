package com.jackson.example.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * @author <a href="mailto:sunil.pulugula@wavemaker.com">Sunil Kumar</a>
 * @since 9/12/15
 */
@JsonTypeName("tiger")
public class Tiger implements Animal {

    private String name;
    private String purr;

    public Tiger(String name, String purr) {
        this.name = name;
        this.purr = purr;
    }

    public Tiger() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurr() {
        return purr;
    }

    public void setPurr(String purr) {
        this.purr = purr;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", purr='" + purr + '\'' +
                '}';
    }
}
