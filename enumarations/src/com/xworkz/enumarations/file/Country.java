package com.xworkz.enumarations.file;

public enum Country {
        AFGHANISTAN("AF"), ALBANIA("AL"), ALGERIA("DZ"), ANDORRA("AD"), ANGOLA("AO"), ARGENTINA("AR"), ARMENIA("AM"), AUSTRALIA("AU"), AUSTRIA("AT"), BANGLADESH("BD"), BELGIUM("BE"),
        BHUTAN("BT"), BRAZIL("BR"), CANADA("CA"), CHINA("CN"), COLOMBIA("CO"), DENMARK("DK"), EGYPT("EG"), FINLAND("FI"), FRANCE("FR"), GERMANY("DE"), GREECE("GR"), HUNGARY("HU"), ICELAND("IS"), INDIA("IN"), INDONESIA("ID"), IRAN("IR"), IRAQ("IQ"), IRELAND("IE"), ISRAEL("IL"), ITALY("IT"), JAPAN("JP"), KENYA("KE"), MALAYSIA("MY"), MEXICO("MX"), NEPAL("NP"), NETHERLANDS("NL"), NEW_ZEALAND("NZ"), NIGERIA("NG"), NORWAY("NO"), PAKISTAN("PK"), PHILIPPINES("PH"), POLAND("PL"), PORTUGAL("PT"), QATAR("QA"),RUSSIA("RU"), SAUDI_ARABIA("SA"), SINGAPORE("SG"), SOUTH_AFRICA("ZA"), SOUTH_KOREA("KR"), SPAIN("ES"), SRI_LANKA("LK"), SWEDEN("SE"), SWITZERLAND("CH"), TAIWAN("TW"), THAILAND("TH"), TURKEY("TR"),UKRAINE("UA"), UNITED_ARAB_EMIRATES("AE"), UNITED_KINGDOM("GB"), UNITED_STATES("US"), VIETNAM("VN");

        public  String code;
        private Country(String code) {
            this.code = code;
        }
        public String getCode() {
            return code;
        }
    }
