package org.vano.stream;

/**
 * Created by Ivan_Pukhov on 5/12/2016.
 */
public class Item {
    private String id;
    private Long digit;
    private String value;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getDigit() {
        return digit;
    }

    public void setDigit(Long digit) {
        this.digit = digit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
