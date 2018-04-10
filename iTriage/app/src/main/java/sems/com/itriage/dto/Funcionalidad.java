package sems.com.itriage.dto;

import java.io.Serializable;


// TODO: Auto-generated Javadoc
/**
 * Estructura que representa un permiso sobre un control de los formularios .
 *
 * @author jabenitez
 */
public class Funcionalidad implements Serializable
{
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /** The clave asociacion. */
    private long claveAsociacion;
    
    /** The funcionalidad. */
    private String funcionalidad;
    
    /** The evento. */
    private long evento;
    
    /** The subsistema. */
    private String subsistema;
    
    
    /**
     * Instantiates a new funcionalidad.
     */
    /* Constructores */
    public Funcionalidad() {   }
    
    /**
     * Instantiates a new funcionalidad.
     *
     * @param claveAsociacion the clave asociacion
     * @param funcionalidad the funcionalidad
     * @param evento the evento
     * @param subsistema the subsistema
     */
    public Funcionalidad( long claveAsociacion, String funcionalidad, 
            long evento, String subsistema )
    {
        this.claveAsociacion = claveAsociacion;
        this.funcionalidad = funcionalidad;
        this.evento = evento;
        this.subsistema = subsistema;
    }
    
    
    /**
     * Gets the clave asociacion.
     *
     * @return the clave asociacion
     */
    /* Metodos GET */
    public long getClaveAsociacion()
    {
        return this.claveAsociacion;
    }
    
    /**
     * Gets the funcionalidad.
     *
     * @return the funcionalidad
     */
    public String getFuncionalidad()
    {
        return this.funcionalidad;
    }
    
    /**
     * Gets the evento.
     *
     * @return the evento
     */
    public long getEvento()
    {
        return this.evento;
    }
    
    /**
     * Gets the subsistema.
     *
     * @return the subsistema
     */
    public String getSubsistema()
    {
        return this.subsistema;
    }
    
    
    /**
     * Sets the clave asociacion.
     *
     * @param claveAsociacion the new clave asociacion
     */
    /* Metodos SET */
    public void setClaveAsociacion( long claveAsociacion )
    {
        this.claveAsociacion = claveAsociacion;
    }
    
    /**
     * Sets the funcionalidad.
     *
     * @param funcionalidad the new funcionalidad
     */
    public void setFuncionalidad( String funcionalidad )
    {
        this.funcionalidad = funcionalidad;
    }
    
    /**
     * Sets the evento.
     *
     * @param evento the new evento
     */
    public void setEvento( long evento )
    {
        this.evento = evento;
    }

    /**
     * Sets the subsistema.
     *
     * @param subsistema the new subsistema
     */
    public void setSubsistema( String subsistema )
    {
        this.subsistema = subsistema;
    }
    
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
	public String toString() {
		return "Funcionalidad [claveAsociacion=" + claveAsociacion
				+ ", funcionalidad=" + funcionalidad + ", evento=" + evento
				+ ", subsistema=" + subsistema + "]";
	}
}
