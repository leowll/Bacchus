/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entity.Shop;
import facade.ShopFacade;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author lwang
 */
@Named(value = "shopViewBean")
@SessionScoped
public class ShopViewBean implements Serializable{

    private Shop shop;

    @EJB
    private ShopFacade shopFacade;
    /**
     * Creates a new instance of ShopViewBean
     */
    public ShopViewBean() {
        this.shop = new Shop();
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
    
    public void setShopByID(Integer id){
        this.shop = shopFacade.find(id);
        
    }
}
