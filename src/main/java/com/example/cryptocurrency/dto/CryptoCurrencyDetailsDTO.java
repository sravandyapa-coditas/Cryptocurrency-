package com.example.cryptocurrency.dto;

public class CryptoCurrencyDetailsDTO {

    private String cryptoCurrencyName;
    private long currentPrice;
    private long marketCap;
    private long volume;

    public String getCryptoCurrencyName() {
        return cryptoCurrencyName;
    }

    public void setCryptoCurrencyName(String cryptoCurrencyName) {
        this.cryptoCurrencyName = cryptoCurrencyName;
    }

    public long getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(long currentPrice) {
        this.currentPrice = currentPrice;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }
}
