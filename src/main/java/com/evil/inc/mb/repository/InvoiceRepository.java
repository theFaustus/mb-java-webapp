package com.evil.inc.mb.repository;

import com.evil.inc.mb.model.Invoice;

import java.util.List;

public interface InvoiceRepository {
    void save(Invoice invoice);
    List<Invoice> findAll();
}
