package com.dacelonid.dna;

class DnaStrand {
    static String makeComplement(String dna) {
        String result = "";
        for(char letter :dna.toCharArray()){
            result = result + DnaBase.valueOf("" + letter).getComplement();
        }
        return result;
    }
}

enum DnaBase{
    A {
        @Override
        String getComplement() {
            return "T";
        }
    }, T {
        @Override
        String getComplement() {
            return "A";
        }
    }, C {
        @Override
        String getComplement() {
            return "G";
        }
    }, G {
        @Override
        String getComplement() {
            return "C";
        }
    };

    abstract String getComplement();
}
