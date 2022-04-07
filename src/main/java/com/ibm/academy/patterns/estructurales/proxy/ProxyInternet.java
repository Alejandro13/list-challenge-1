package com.ibm.academy.patterns.estructurales.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements IInternet{

    private IInternet internet = new AccessToInternet();
    public static List<String> bannerUrl;

    static{
        bannerUrl = new ArrayList<>();
        bannerUrl.add("facebook.com");
        bannerUrl.add("twitter.com");
        bannerUrl.add("php");
    }

    public ProxyInternet(){
        System.out.println("Constructor");
    }

    @Override
    public void connectTo(String url) throws Exception {
        if(bannerUrl.contains(url)){
            throw new Exception("URL bloqueda, acceso denegado al sitio: " + url);
        }
        //si es correcto, mandamos la url
        internet.connectTo(url);
    }
}
