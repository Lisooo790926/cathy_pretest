package com.pretest.coindesk.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoinData {

    @Id
    @Column(unique = true)
    private String code;
    private String symbol;
    private String rate;
    private String description;
    private Double rate_float;
}
