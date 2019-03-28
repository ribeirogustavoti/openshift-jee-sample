/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grb.com.br.interfaces;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author ribeigu
 */
@Named(value = "introductionBean")
@Dependent
public class IntroductionBean {

    private String content;

    /**
     * Creates a new instance of IntroductionBean
     */
    public IntroductionBean() {
    }

    @PostConstruct
    public void init() {
        this.content = "Welcome";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
