package com.example.cryptoviewer;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class CryptoPull {
    public ArrayList<ArrayList<String>> getDay() {
        ArrayList<ArrayList<String>> values = new ArrayList<>();
        ArrayList<String> times = new ArrayList<>();
        ArrayList<String> opens = new ArrayList<>();
        ArrayList<String> closes = new ArrayList<>();
        ArrayList<String> highs = new ArrayList<>();
        ArrayList<String> lows = new ArrayList<>();

        String addr = "https://min-api.cryptocompare.com/data/histoday?aggregate=1&e=CCCAGG&extraParams=CryptoCompare&fsym=BTC&limit=10&tryConversion=false&tsym=USD";
        try {
            URL address = new URL(addr);
            JsonReader reader = new JsonReader(new InputStreamReader(address.openStream()));
            Gson gson = new Gson();
            JsonObject root = gson.fromJson(reader, JsonObject.class);
            JsonArray data = root.getAsJsonArray("Data");

            for (int i = 0; i < data.size(); i++) {
                String timestamp = data.get(i).getAsJsonObject().get("time").toString();
                String time = new Date((long) Integer.parseInt(timestamp) * 1000).toString().substring(0, 10);
                times.add(time);

                String open = data.get(i).getAsJsonObject().get("open").toString();
                opens.add(open);

                String close = data.get(i).getAsJsonObject().get("close").toString();
                closes.add(close);

                String high = data.get(i).getAsJsonObject().get("high").toString();
                highs.add(high);

                String low = data.get(i).getAsJsonObject().get("low").toString();
                lows.add(low);

                values.add(times);
                values.add(opens);
                values.add(lows);
                values.add(highs);
                values.add(closes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return values;
    }

    public ArrayList<ArrayList<String>> getHour() {
        ArrayList<ArrayList<String>> values = new ArrayList<>();
        ArrayList<String> times = new ArrayList<>();
        ArrayList<String> opens = new ArrayList<>();
        ArrayList<String> closes = new ArrayList<>();
        ArrayList<String> highs = new ArrayList<>();
        ArrayList<String> lows = new ArrayList<>();

        String addr = "https://min-api.cryptocompare.com/data/histohour?aggregate=1&e=CCCAGG&extraParams=CryptoCompare&fsym=BTC&limit=10&tryConversion=false&tsym=USD";
        try {
            URL address = new URL(addr);
            JsonReader reader = new JsonReader(new InputStreamReader(address.openStream()));
            Gson gson = new Gson();
            JsonObject root = gson.fromJson(reader, JsonObject.class);
            JsonArray data = root.getAsJsonArray("Data");

            for (int i = 0; i < data.size(); i++) {
                String timestamp = data.get(i).getAsJsonObject().get("time").toString();
                String time = new Date((long) Integer.parseInt(timestamp) * 1000).toString().substring(11, 19);
                times.add(time);

                String open = data.get(i).getAsJsonObject().get("open").toString();
                opens.add(open);

                String close = data.get(i).getAsJsonObject().get("close").toString();
                closes.add(close);

                String high = data.get(i).getAsJsonObject().get("high").toString();
                highs.add(high);

                String low = data.get(i).getAsJsonObject().get("low").toString();
                lows.add(low);

                values.add(times);
                values.add(opens);
                values.add(lows);
                values.add(highs);
                values.add(closes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return values;
    }

    public ArrayList<ArrayList<String>> getMin() {
        ArrayList<ArrayList<String>> values = new ArrayList<>();
        ArrayList<String> times = new ArrayList<>();
        ArrayList<String> opens = new ArrayList<>();
        ArrayList<String> closes = new ArrayList<>();
        ArrayList<String> highs = new ArrayList<>();
        ArrayList<String> lows = new ArrayList<>();

        String addr = "https://min-api.cryptocompare.com/data/histominute?aggregate=1&e=CCCAGG&extraParams=CryptoCompare&fsym=BTC&limit=10&tryConversion=false&tsym=USD";
        try {
            URL address = new URL(addr);
            JsonReader reader = new JsonReader(new InputStreamReader(address.openStream()));
            Gson gson = new Gson();
            JsonObject root = gson.fromJson(reader, JsonObject.class);
            JsonArray data = root.getAsJsonArray("Data");

            for (int i = 0; i < data.size(); i++) {
                String timestamp = data.get(i).getAsJsonObject().get("time").toString();
                String time = new Date((long) Integer.parseInt(timestamp) * 1000).toString().substring(11, 19);
                times.add(time);

                String open = data.get(i).getAsJsonObject().get("open").toString();
                opens.add(open);

                String close = data.get(i).getAsJsonObject().get("close").toString();
                closes.add(close);

                String high = data.get(i).getAsJsonObject().get("high").toString();
                highs.add(high);

                String low = data.get(i).getAsJsonObject().get("low").toString();
                lows.add(low);

                values.add(times);
                values.add(opens);
                values.add(lows);
                values.add(highs);
                values.add(closes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return values;
    }
}
