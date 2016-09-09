/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author lwang
 */
@Named(value = "testBean")
@RequestScoped
public class TestBean {

    /**
     * Creates a new instance of TestBean
     */
    public TestBean() {
    }
    
    public String test(){
        return "test/testPage";
    }
    
}
