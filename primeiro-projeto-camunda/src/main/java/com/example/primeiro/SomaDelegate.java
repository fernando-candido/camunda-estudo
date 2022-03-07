package com.example.primeiro;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


public class SomaDelegate implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
    // var A = execution.getVariable("A")
    // var B = execution.getVariable("B")
    // execution.setVariable("resultado", A + B)
    Long A = (Long) execution.getVariable("A");
    Long B = (Long) execution.getVariable("B");
    execution.setVariable("resultado", A+B);


    }
    
}
