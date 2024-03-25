/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.MarketModel;

import java.util.ArrayList;
import model.Business.Business;

/**
 *
 * @author kal bugrara
 */
public class ChannelCatalog {
    Business business;
    ArrayList<Channel> channellist;

    public ChannelCatalog(Business d) {

        business = d;
        channellist = new ArrayList();

    }
    
}
