/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcapi;

import java.util.*;

/**
 *
 * @author kamaj
 */
public class TrafficCard implements Comparable {
    int mTravellerNumber;
    String mOwnerName;
    float mBalance;
    
    public TrafficCard(int tNumber, String oName, float balance){
        mTravellerNumber = tNumber;
        mOwnerName = oName;
        mBalance = balance;
    }

    public int getmTravellerNumber() {
        return mTravellerNumber;
    }
    
    @Override
    public String toString(){
        return "owner: "+mOwnerName+" number: "+mTravellerNumber+" balance: "+mBalance;
    }

    @Override
    public int compareTo(Object o) {
        TrafficCard tc = (TrafficCard) o;

        if (mTravellerNumber == tc.getmTravellerNumber()) {
            return 0;
        } else if (mTravellerNumber > tc.getmTravellerNumber()) {
            return 1;
        } else {
            return -1;
        }
    }
}
