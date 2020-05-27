package com.evil.inc.mb.service.impl;

import com.evil.inc.mb.config.Application;
import com.evil.inc.mb.model.Invoice;
import com.evil.inc.mb.model.User;
import com.evil.inc.mb.repository.InvoiceRepository;
import com.evil.inc.mb.repository.impl.InMemInvoiceRepositoryImpl;
import com.evil.inc.mb.service.InvoiceService;
import com.evil.inc.mb.service.UserService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {

    private final UserService userService;
    private final InvoiceRepository invoiceRepository;

    public Invoice create(String userId, Integer amount){
        User user = userService.findById(userId);  //
        if (user == null) {
            throw new IllegalStateException(); //
        }
        final Invoice invoice = new Invoice("http://cantemir.asm.md/files/u1/descrierea_moldovei.pdf", userId, amount);
        invoiceRepository.save(invoice);
        return invoice;
    }

    public List<Invoice> findAll(){
        return invoiceRepository.findAll();
    }
}
