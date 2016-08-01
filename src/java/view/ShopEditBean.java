/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entity.Shop;
import facade.ShopFacade;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author lwang
 */
@Named(value = "shopEditBean")
@RequestScoped
public class ShopEditBean {

    private Shop shop;

    @EJB
    private ShopFacade shopFacade;
    
    @Inject
    private ShopViewBean shopViewBean;
    /**
     * Creates a new instance of ShopEditBean
     */
    public ShopEditBean() {
    }
    
    public String updateShop(){
        this.shop = shopViewBean.getShop();
        shopFacade.edit(this.shop);
        return "shopinfo";
    }
    
    public String deleteShop(){
        this.shop = shopViewBean.getShop();
        shopFacade.remove(this.shop);
        return "shoplist";
    }
    
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
