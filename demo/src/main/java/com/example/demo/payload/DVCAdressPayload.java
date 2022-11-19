package com.example.demo.payload;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class DVCAdressPayload {

    private int id;
    private String city;
    private String mark;
    private long pin_code;
    private long zip_code;
}
