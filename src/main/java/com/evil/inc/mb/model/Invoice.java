package com.evil.inc.mb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class Invoice {
    private String id = UUID.randomUUID().toString();
    private String pdfUrl;
    private String userId;
    private Integer amount;

    public Invoice(String pdfUrl, String userId, Integer amount) {
        this.pdfUrl = pdfUrl;
        this.userId = userId;
        this.amount = amount;
    }
}
