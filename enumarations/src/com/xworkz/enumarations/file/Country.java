package com.xworkz.enumarations.file;

public enum Country {
       AUSTRALIA("AU"), BELGIUM("BE"),
        BHUTAN("BT"), BRAZIL("BR"), CANADA("CA"), CHINA("CN"),
    FINLAND("FI"), FRANCE("FR"), GERMANY("DE"),
     INDIA("IN"), INDONESIA("ID"),ITALY("IT"),
    JAPAN("JP"), NETHERLANDS("NL"), NEW_ZEALAND("NZ"), NIGERIA("NG"), NORWAY("NO"),
  PHILIPPINES("PH"),QATAR("QA"),RUSSIA("RU"), SAUDI_ARABIA("SA"), SINGAPORE("SG"),
    SOUTH_KOREA("KR"),SWEDEN("SE");
        public  String code;
        private Country(String code) {
            this.code = code;
        }
        public String getCode() {
            return code;
        }
    }
