package com.capstone.reviewsummary;

import com.capstone.reviewsummary.summary.service.CrawlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CwalTest {
    @Autowired
    private CrawlingService crawlingService;
}
