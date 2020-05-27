package com.evil.inc.mb.repository.impl;

import com.evil.inc.mb.model.Invoice;
import com.evil.inc.mb.repository.InvoiceRepository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InMemInvoiceRepositoryImpl implements InvoiceRepository {
    List<Invoice> invoices = new CopyOnWriteArrayList<Invoice>();

    public void save(Invoice invoice) {
        invoices.add(invoice);
    }

    public List<Invoice> findAll() {
        return invoices;
    }
}
