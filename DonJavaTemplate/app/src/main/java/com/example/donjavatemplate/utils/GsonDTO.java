package com.example.donjavatemplate.utils;

import java.util.ArrayList;

public class GsonDTO {
        String ret_code;
        String ret_msg;
        Data data;

        public String getRet_code() {
            return ret_code;
        }

        public void setRet_code(String ret_code) {
            this.ret_code = ret_code;
        }

        public String getRet_msg() {
            return ret_msg;
        }

        public void setRet_msg(String ret_msg) {
            this.ret_msg = ret_msg;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        public class Data {
            String noti_seq;
            String noti_title;
            String ver;
            String ctn_count;
            String service_count;
            ArrayList<Price> price;

            public String getNoti_seq() {
                return noti_seq;
            }

            public void setNoti_seq(String noti_seq) {
                this.noti_seq = noti_seq;
            }

            public String getNoti_title() {
                return noti_title;
            }

            public void setNoti_title(String noti_title) {
                this.noti_title = noti_title;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public String getCtn_count() {
                return ctn_count;
            }

            public void setCtn_count(String ctn_count) {
                this.ctn_count = ctn_count;
            }

            public String getService_count() {
                return service_count;
            }

            public void setService_count(String service_count) {
                this.service_count = service_count;
            }

            public ArrayList<Price> getPrice() {
                return price;
            }

            public void setPrice(ArrayList<Price> price) {
                this.price = price;
            }
        }

        public class Price {
            String ctn;
            String seq;
            String url;
            String pic_default;
            int list_count;

            public String getCtn() {
                return ctn;
            }

            public void setCtn(String ctn) {
                this.ctn = ctn;
            }

            public String getSeq() {
                return seq;
            }

            public void setSeq(String seq) {
                this.seq = seq;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getPic_default() {
                return pic_default;
            }

            public void setPic_default(String pic_default) {
                this.pic_default = pic_default;
            }

            public int getList_count() {
                return list_count;
            }

            public void setList_count(int list_count) {
                this.list_count = list_count;
            }
        }

    }
