package me.home.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category
{

    @Id
    Integer idCategory;
    String  libelle;

    public Category( String libelle )
    {
        this.libelle = libelle;
    }

    @Override
    public String toString( )
    {
        return String.format( "Category[id=%d, libelle='%s]", idCategory, libelle );
    }

}
