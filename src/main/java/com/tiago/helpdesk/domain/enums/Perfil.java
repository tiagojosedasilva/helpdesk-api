package com.tiago.helpdesk.domain.enums;


public enum Perfil {

    ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");

    private Integer cod;
    private String desc;

    Perfil(Integer cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }
    public Integer getCod() {
        return cod;
    }
    public String getDesc() {
        return desc;
    }

    public static Perfil toEnum(Integer cod) {
        if(cod == null){
            return null;
        }
        for (Perfil x : Perfil.values()){
            if (cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Perfil inválido!");
    }

}
