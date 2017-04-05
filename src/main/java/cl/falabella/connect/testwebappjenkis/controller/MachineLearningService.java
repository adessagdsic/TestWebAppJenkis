/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.falabella.connect.testwebappjenkis.controller;

import org.springframework.stereotype.Service;

/**
 *
 * @author ext_dayanez
 */
@Service("ml")
public class MachineLearningService implements DataModelService{

    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    
    
}
