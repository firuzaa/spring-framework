package com.company.services.carpet;

import com.company.enums.City;
import com.company.interfaces.carpetPrices.Carpet;
import com.sun.applet2.AppletParameters;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetVA implements Carpet {

    private static final Map<City, BigDecimal> sqPriceForCity = new HashMap<>();

    static {
        sqPriceForCity.put(City.MCLEAN, new BigDecimal(5.56));
        sqPriceForCity.put(City.ARLINGTON, new BigDecimal(2.26));
        sqPriceForCity.put(City.FAIRFAX, new BigDecimal(3.89));
    }

    @Override
    public BigDecimal getSqFtPrice(City city) {

        BigDecimal defaultValue = BigDecimal.ZERO;
        Optional<Map.Entry<City, BigDecimal>> collect = sqPriceForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();

        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}
