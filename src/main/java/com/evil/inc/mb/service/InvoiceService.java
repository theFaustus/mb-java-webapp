package com.evil.inc.mb.service;

import com.evil.inc.mb.model.Invoice;

import java.util.List;

public interface InvoiceService {
    Invoice create(String userId, Integer amount);

    List<Invoice> findAll();
}
