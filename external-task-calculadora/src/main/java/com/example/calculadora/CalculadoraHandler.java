package com.example.calculadora;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.stereotype.Component;

@Component
@ExternalTaskSubscription("calculadora")
public class CalculadoraHandler implements ExternalTaskHandler{

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
    
        Long resultado = 0L;
        long A = externalTask.getVariable("A");
        long B = externalTask.getVariable("B");
        String operacao = externalTask.getVariable("operação");
        
        switch(operacao){
            case "adicao":
                resultado = A + B;
                break;
            case "subtracao":
                resultado = A - B;
                break;
            case "multiplicacao":
                resultado = A * B;
                break;
            case "divisao":
                resultado = A / B;
                break;
        }
        VariableMap variaveis = Variables.createVariables();
        externalTaskService.complete(externalTask, variaveis);


    }

    
}
