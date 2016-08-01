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
@Named(value = "shopEntryBean")
@RequestScoped
public class ShopEntryBean {

    private Shop shop;

    @EJB
    private ShopFacade shopFacade;
    @Inject
    private ShopViewBean shopViewBean;
    
    /**
     * Creates a new instance of ShopEntryBean
     */
    public ShopEntryBean() {
        this.shop = new Shop();
    }

    public String newShop(){
        shopFacade.create(shop);
        shopViewBean.setShop(shop);
        return "shopinfo";
    }
    
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
