package com.tiago.helpdesk.domain.enums;


public enum Prioridade {

    BAIXA(0, "BAIXA"), MMEDIA(1, "MMEDIA"), ALTA(2, "ALTA");

    private Integer cod;
    private String desc;

    Prioridade(Integer cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }
    public Integer getCod() {
        return cod;
    }
    public String getDesc() {
        return desc;
    }

    public static Prioridade toEnum(Integer cod) {
        if(cod == null){
            return null;
        }
        for (Prioridade x : Prioridade.values()){
            if (cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Prioridade inválida!");
    }

}
