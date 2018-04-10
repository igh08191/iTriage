package sems.com.itriage.dto;

import java.io.Serializable;


// TODO: Auto-generated Javadoc
/**
 * Clase que mapea una sesion abierta.
 *
 * @author jabenitez
 */
public class SesionAbierta implements Serializable
{
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /** The token sesion. */
    private long tokenSesion;
    
    /** The ip puesto. */
    private String ipPuesto;
    
    
    /**
     * Instantiates a new sesion abierta.
     */
    /* Constructores */
    public SesionAbierta() {  }
    
    /**
     * Instantiates a new sesion abierta.
     *
     * @param tokenSesion the token sesion
     * @param ipPuesto the ip puesto
     */
    public SesionAbierta( long tokenSesion, String ipPuesto )
    {
        this.tokenSesion = tokenSesion;
        this.ipPuesto = ipPuesto;
    }
    
    
    /**
     * Gets the token sesion.
     *
     * @return the token sesion
     */
    /* Metodos GET */
    public long getTokenSesion()
    {
        return this.tokenSesion;
    }
    
    /**
     * Gets the ip puesto.
     *
     * @return the ip puesto
     */
    public String getIpPuesto()
    {
        return this.ipPuesto;
    }
    
    
    /**
     * Sets the token sesion.
     *
     * @param tokenSesion the new token sesion
     */
    /* Metodos SET */
    public void setTokenSesion( long tokenSesion )
    {
        this.tokenSesion = tokenSesion;
    }
    
    /**
     * Sets the ip puesto.
     *
     * @param ipPuesto the new ip puesto
     */
    public void setIpPuesto( String ipPuesto )
    {
        this.ipPuesto = ipPuesto;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
    	return new StringBuilder().
    			append(" TOKEN: ").append(this.tokenSesion).
    			append(" IP. PUESTO: ").append(this.ipPuesto).
    			toString();
    }
}
