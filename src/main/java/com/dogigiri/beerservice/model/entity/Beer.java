package com.dogigiri.beerservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Beer {
    private UUID beerId;
    private String beerName;
    private BeerStyle beerStyle;
    private OffsetDateTime creationDate;
    private OffsetDateTime lastModified;
    private Integer quantityOnHand;
    private Integer version;
    private BigDecimal price;
    private String upc;
}
