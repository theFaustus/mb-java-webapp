package com.evil.inc.mb.config;

import com.evil.inc.mb.repository.InvoiceRepository;
import com.evil.inc.mb.repository.UserRepository;
import com.evil.inc.mb.repository.impl.InMemInvoiceRepositoryImpl;
import com.evil.inc.mb.repository.impl.UserRepositoryImpl;
import com.evil.inc.mb.service.InvoiceService;
import com.evil.inc.mb.service.UserService;
import com.evil.inc.mb.service.impl.InvoiceServiceImpl;
import com.evil.inc.mb.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {
    public static final InvoiceRepository invoiceRepository = new InMemInvoiceRepositoryImpl();
    public static final UserRepository userRepository = new UserRepositoryImpl();

    public static final UserService userService = new UserServiceImpl(userRepository);
    public static final InvoiceService invoiceService = new InvoiceServiceImpl(userService, invoiceRepository);
    public static final ObjectMapper objectMapper = new ObjectMapper();
}
