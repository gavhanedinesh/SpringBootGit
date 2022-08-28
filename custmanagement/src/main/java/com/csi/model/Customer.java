package com.csi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue

    private long custId;

    private String custName;

    private String custAddress;

    private double custAccountBalance;

    private long custContactNumber;

    private String custEmailId;

    private String custPassword;
}
