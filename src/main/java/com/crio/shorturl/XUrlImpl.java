package com.crio.shorturl;


import java.util.HashMap;

public class XUrlImpl implements XUrl {

    private HashMap<String, String> Url1 = new HashMap<>();
    private HashMap<String, String> Url2 = new HashMap<>();
    private HashMap<String, Integer> count = new HashMap<>();
    // private int count = 0;


    private String getAlphaNumericString() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(9);
        for (int i = 0; i < 9; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        String shortUrl = "http://short.url/" + sb;
        return shortUrl;
    }

    @Override
    public String registerNewUrl(String longUrl) {
        // TODO Auto-generated method stub
        if (Url1.containsKey(longUrl)) {
            return Url1.get(longUrl);
        }
        String shortUrl = getAlphaNumericString();
        Url1.put(longUrl, shortUrl);
        Url2.put(shortUrl, longUrl);
        count.put(longUrl, 0);
        return shortUrl;
    }

    @Override
    public String registerNewUrl(String longUrl, String shortUrl) {
        // TODO Auto-generated method stub
        if (Url2.containsKey(shortUrl)) {
            return null;
        }
        Url1.put(longUrl, shortUrl);
        Url2.put(shortUrl, longUrl);
        count.put(longUrl, 0);

        return shortUrl;
    }

    @Override
    public String getUrl(String shortUrl) {
        // TODO Auto-generated method stub
        // count++;
        if (!Url2.containsKey(shortUrl)) {
            return null;
        }
        String url = Url2.get(shortUrl);
        count.put(url, (count.get(url) + 1));

        // String url = Url2.get(shortUrl);
        return Url2.get(shortUrl);
    }

    @Override
    public Integer getHitCount(String longUrl) {
        // TODO Auto-generated method stub
        if(!count.containsKey(longUrl)){
            return 0;
        }
        return count.get(longUrl);
    }

    @Override
    public String delete(String longUrl) {
        // TODO Auto-generated method stub
        String url = Url1.get(longUrl);
        Url1.remove(longUrl);
        Url2.remove(url);
        return url;
    }

}
