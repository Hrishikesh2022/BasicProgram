package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue

    private int custId;

    private String custName;

    private double custPrice;

    private long custCode;
    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "Asia/Kolkata")
    private Date custLaunchDate;

    private double custDiscount;

    private String custDescription;




}
