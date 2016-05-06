package br.com.isports.entity.utils;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author dudu
 */
@MappedSuperclass
public abstract class BaseEntity {

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract int hashCode();

}
