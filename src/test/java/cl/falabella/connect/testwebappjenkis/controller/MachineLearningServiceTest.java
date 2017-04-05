/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.falabella.connect.testwebappjenkis.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

/**
 *
 * @author ext_dayanez
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class MachineLearningServiceTest {
    
    //DI
    @Autowired
    @Qualifier("ml")
    DataModelService ml;

    @Test
    public void test_ml_always_return_true() {

        //assert correct type/impl
        assertThat(ml, instanceOf(MachineLearningService.class));

        //assert true
        assertThat(ml.suma(2, 2), is(4));

        assertThat(ml.suma(3, 3), is(6));              
    }
}
