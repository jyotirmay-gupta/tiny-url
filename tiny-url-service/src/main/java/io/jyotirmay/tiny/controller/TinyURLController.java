/*
 * Copyright (c) 2025 Jyotirmay Gupta
 *
 * Project: Tiny URL
 * Description: This is a personal project by Jyotirmay Gupta that implements a
 * simplified URL shortening service, similar in concept to services like bit.ly or tinyurl.com.
 * It allows long URLs to be converted into compact, easy-to-share short URLs.
 *
 * This code is intended for educational and personal use, demonstrating core backend
 * concepts such as encoding algorithms, database storage, and URL mapping.
 *
 * Licensed under the MIT License. See LICENSE file for more details.
 */

package io.jyotirmay.tiny.controller;

import io.jyotirmay.tiny.service.CreateTinyURLBusinessService;
import io.jyotirmay.tiny.service.DeactivateTinyURLBusinessService;
import io.jyotirmay.tiny.service.GetActualURLBusinessService;
import io.jyotirmay.tiny.service.UpdateTinyURLBusinessService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TinyURLController {

    private static final Logger LOGGER = LogManager.getLogger(TinyURLController.class);

    private final CreateTinyURLBusinessService createTinyURLBusinessService;

    private final GetActualURLBusinessService getActualURLBusinessService;

    private final UpdateTinyURLBusinessService updateTinyURLBusinessService;

    private final DeactivateTinyURLBusinessService deactivateTinyURLBusinessService;

    public TinyURLController(CreateTinyURLBusinessService createTinyURLBusinessService, GetActualURLBusinessService getActualURLBusinessService,
                             UpdateTinyURLBusinessService updateTinyURLBusinessService, DeactivateTinyURLBusinessService deactivateTinyURLBusinessService) {
        this.createTinyURLBusinessService = createTinyURLBusinessService;
        this.getActualURLBusinessService = getActualURLBusinessService;
        this.updateTinyURLBusinessService = updateTinyURLBusinessService;
        this.deactivateTinyURLBusinessService = deactivateTinyURLBusinessService;
    }

    
}
