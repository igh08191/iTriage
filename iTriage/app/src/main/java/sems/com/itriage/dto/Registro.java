package sems.com.itriage.dto;

import java.io.Serializable;

/**
 * Clase que mapea un registro (id, codigo y texto de un registro).
 *
 * @author jabenitez
 */
public class Registro implements Serializable
{
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /** The id registro. */
    private long idRegistro;
    
    /** The cod registro. */
    private String codRegistro;
    
    /** The texto. */
    private String texto;
    
    
    /**
     * Instantiates a new registro.
     */
    /* Constructores */
    public Registro() { super(); }
    
    /**
     * Instantiates a new registro.
     *
     * @param idRegistro the id registro
     * @param codRegistro the cod registro
     * @param texto the texto
     */
    public Registro( long idRegistro, String codRegistro, String texto )
    {
        this.idRegistro = idRegistro;
        this.codRegistro = codRegistro;
        this.texto = texto;
    }
    
    
    /**
     * Gets the id registro.
     *
     * @return the id registro
     */
    /* Metodos GET */
    public long getIdRegistro()
    {
        return this.idRegistro;
    }
    
    /**
     * Gets the cod registro.
     *
     * @return the cod registro
     */
    public String getCodRegistro()
    {
        return this.codRegistro;
    }
    
    /**
     * Gets the texto.
     *
     * @return the texto
     */
    public String getTexto()
    {
        return this.texto;
    }
    
    
    /**
     * Sets the id registro.
     *
     * @param idRegistro the new id registro
     */
    /* Metodos SET */
    public void setIdRegistro( long idRegistro )
    {
        this.idRegistro = idRegistro;
    }
    
    /**
     * Sets the cod registro.
     *
     * @param codRegistro the new cod registro
     */
    public void setCodRegistro( String codRegistro )
    {
        this.codRegistro = codRegistro;
    }
    
    /**
     * Sets the texto.
     *
     * @param texto the new texto
     */
    public void setTexto( String texto )
    {
        this.texto = texto;
    }
    
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    /* Se sobreescribe el metodo para auditorias */
    @Override
    public String toString()
    {
        StringBuilder sbr = new StringBuilder();
        
        sbr.append(  " idRegistro: " ).append( idRegistro ).
            append( " | codRegistro: ").append(codRegistro).
            append( " | texto: ").append(texto);
        
        return sbr.toString();
    }
}
