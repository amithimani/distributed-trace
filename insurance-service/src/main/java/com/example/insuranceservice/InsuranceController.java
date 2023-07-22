package com.example.insuranceservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InsuranceController {

    private PolicyService policyService;
    private ClaimService claimService;
    private static final Logger logger = LoggerFactory.getLogger(InsuranceController.class);

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    InsuranceController(PolicyService policyService, ClaimService claimService){
        this.policyService = policyService;
        this.claimService = claimService;
    }

    @GetMapping("/policy")
    public String getPolicy(@RequestParam("id") Integer customerId) throws Exception{
        logger.info("Incoming request at {} for request policy ", applicationName);
        return policyService.findPolicy(customerId);
    }

    @GetMapping("/claim")
    public String getFullName(@RequestParam("id") Integer customerId) throws Exception{
        logger.info("Incoming request at {} for request claim ", applicationName);
        return claimService.findClaim(customerId);
    }
}
