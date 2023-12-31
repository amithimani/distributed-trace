package dev.knowledgecafe.customerservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/")
public class CustomerController {
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private RestTemplate restTemplate;
    private static final String BASE_URL
            = "http://localhost:8090/";

    @Value("${spring.application.name}")
    private String applicationName;

    public CustomerController(RestTemplate rest) {
        this.restTemplate = rest;
    }

    @GetMapping("/customer")
    public ResponseEntity info(@RequestParam("id") Integer customerId) {

        logger.info("Incoming request at {} for request customer/info ", applicationName);
        Map<String, Integer> params = Collections.singletonMap("id", customerId);
        String policyId = restTemplate.getForObject(BASE_URL+ "policy?id={id}", String.class, params);
        String claimId = restTemplate.getForObject(BASE_URL+ "claim?id={id}", String.class, params);
        CustomerPojo customer = new CustomerPojo(customerId, policyId,claimId);
        return ResponseEntity.ok(customer);
    }

}
