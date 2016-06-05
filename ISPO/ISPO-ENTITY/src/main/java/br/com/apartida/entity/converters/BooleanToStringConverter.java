/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.entity.converters;

import javax.persistence.AttributeConverter;

/**
 *
 * @author dudu
 */
public class BooleanToStringConverter 
        implements AttributeConverter<Boolean, String> {

    /**
     * This implementation will return "Y" if the parameter is Boolean.TRUE,
     * otherwise it will return "N" when the parameter is Boolean.FALSE. 
     * A null input value will yield a null return value.
     * @param b Boolean
     * @return 
     */
    @Override
    public String convertToDatabaseColumn(Boolean b) {
        if (null == b) {
            return null;
        }
        if (b) {
            return "S";
        }
        return "N";
    }

    /**
     * This implementation will return Boolean.TRUE if the string
     * is "Y" or "y", otherwise it will ignore the value and return
     * Boolean.FALSE (it does not actually look for "N") for any
     * other non-null string. A null input value will yield a null
     * return value.
     * @param s String
     */
    @Override
    public Boolean convertToEntityAttribute(String s) {
        if (null == s) {
            return null;
        }
        if (s.equals("S") || s.equals("s")) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

}
