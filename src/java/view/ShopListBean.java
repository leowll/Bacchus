/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entity.Shop;
import facade.ShopFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author lwang
 */
@Named(value="shopListBean")
@RequestScoped
public class ShopListBean{
    private List<Shop> shopList;

    @EJB
    private ShopFacade shopFacade;
    /**
     * Creates a new instance of ShopListBean
     */
    public ShopListBean() {
        this.shopList = new ArrayList<Shop>();
    }
    
    public String refresh(){
        System.out.println("in get shop list");
        this.shopList = shopFacade.findAll();
        System.out.println("list size:" + this.shopList.size());
        return "shoplist";
    }
    public List<Shop> getShopList() {
        return shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
    }
    
}
