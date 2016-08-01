/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author lwang
 */
@Named()
@RequestScoped
public class BackingBean{
    @Inject
    private ShopListBean shopListBean;
    /**
     * Creates a new instance of BackingBean
     */
    public BackingBean() {
    }

    public String showList() {
        shopListBean.refresh();
        return "shoplist";
    }

    public String newShop() {
        return "newshop";
    }
}
