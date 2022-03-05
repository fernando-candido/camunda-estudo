package com.example.primeiro;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class DivisaoDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        
        Long A = (Long) execution.getVariable("A");
        Long B = (Long) execution.getVariable("B");
        execution.setVariable("resultado", A/B);
        
    }
    
}
