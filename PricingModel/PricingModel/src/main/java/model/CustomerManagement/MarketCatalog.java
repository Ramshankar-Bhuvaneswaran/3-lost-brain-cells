/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CustomerManagement;

import java.util.ArrayList;
import model.Business.Business;
import model.MarketModel.Market;

/**
 *
 * @author kal bugrara
 */
public class MarketCatalog {
    Business business;
    ArrayList<Market> markets;
    public MarketCatalog(Business d) {

        business = d;
        markets = new ArrayList();

    }
}
