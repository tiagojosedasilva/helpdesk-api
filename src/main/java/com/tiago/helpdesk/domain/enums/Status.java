package com.tiago.helpdesk.domain.enums;


public enum Status {

    ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");

    private Integer cod;
    private String desc;

    Status(Integer cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }
    public Integer getCod() {
        return cod;
    }
    public String getDesc() {
        return desc;
    }

    public static Status toEnum(Integer cod){
        if(cod == null){
            return null;
        }
        for (Status x : Status.values()){
            if (cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Status inválido!");
    }

}
