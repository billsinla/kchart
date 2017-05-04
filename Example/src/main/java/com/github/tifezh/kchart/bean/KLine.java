package com.github.tifezh.kchart.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by federica on 2017/5/4.
 */

public class KLine {

    /**
     * Market : 0
     * Code : 000001
     * KLineType : 1
     * Weight : 0
     * PushFlag : 0
     * LastOldTime : 2014-1-30 6:20:0
     * KLine : [{"Time":"2014-10-13 5:51:0","Open":2354.26,"High":2355.26,"Low":2354.07,"Close":2354.65,"Volume":601392,"Amount":4.81198E8}]
     */

    private int Market;
    private String Code;
    private int KLineType;
    private int Weight;
    private int PushFlag;
    private String LastOldTime;
    private List<KLineBean> KLine;

    public static KLine objectFromData(String str) {

        return new Gson().fromJson(str, KLine.class);
    }

    public static List<KLine> arrayKLineFromData(String str) {

        Type listType = new TypeToken<ArrayList<KLine>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public int getMarket() {
        return Market;
    }

    public void setMarket(int Market) {
        this.Market = Market;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public int getKLineType() {
        return KLineType;
    }

    public void setKLineType(int KLineType) {
        this.KLineType = KLineType;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public int getPushFlag() {
        return PushFlag;
    }

    public void setPushFlag(int PushFlag) {
        this.PushFlag = PushFlag;
    }

    public String getLastOldTime() {
        return LastOldTime;
    }

    public void setLastOldTime(String LastOldTime) {
        this.LastOldTime = LastOldTime;
    }

    public List<KLineBean> getKLine() {
        return KLine;
    }

    public void setKLine(List<KLineBean> KLine) {
        this.KLine = KLine;
    }

    public static class KLineBean {
        /**
         * Time : 2014-10-13 5:51:0
         * Open : 2354.26
         * High : 2355.26
         * Low : 2354.07
         * Close : 2354.65
         * Volume : 601392
         * Amount : 4.81198E8
         */

        private String Time;
        private double Open;
        private double High;
        private double Low;
        private double Close;
        private int Volume;
        private double Amount;

        public static KLineBean objectFromData(String str) {

            return new Gson().fromJson(str, KLineBean.class);
        }

        public static List<KLineBean> arrayKLineBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<KLineBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public String getTime() {
            return Time;
        }

        public void setTime(String Time) {
            this.Time = Time;
        }

        public double getOpen() {
            return Open;
        }

        public void setOpen(double Open) {
            this.Open = Open;
        }

        public double getHigh() {
            return High;
        }

        public void setHigh(double High) {
            this.High = High;
        }

        public double getLow() {
            return Low;
        }

        public void setLow(double Low) {
            this.Low = Low;
        }

        public double getClose() {
            return Close;
        }

        public void setClose(double Close) {
            this.Close = Close;
        }

        public int getVolume() {
            return Volume;
        }

        public void setVolume(int Volume) {
            this.Volume = Volume;
        }

        public double getAmount() {
            return Amount;
        }

        public void setAmount(double Amount) {
            this.Amount = Amount;
        }
    }
}
