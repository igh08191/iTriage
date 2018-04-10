package sems.com.itriage.dto;


import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * Clase que genera el xml de una categoria funcional.
 *
 * @author mrojas
 */
public class CategoriaFuncional implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1596262489281899093L;
    
    /** The id categoria. */
    long idCategoria;
    
    /** The descripcion. */
    String descripcion;

    /**
     * Instantiates a new categoria funcional.
     */
    public CategoriaFuncional( )
    {
        super();
    }

    /**
     * Instantiates a new categoria funcional.
     *
     * @param idCategoria the id categoria
     * @param descripcion the descripcion
     */
    public CategoriaFuncional( long idCategoria, String descripcion )
    {
        super();
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
    }
    
    /**
     * Gets the id categoria.
     *
     * @return the id categoria
     */
    public long getIdCategoria( )
    {
        return idCategoria;
    }
    
    /**
     * Gets the descripcion.
     *
     * @return the descripcion
     */
    public String getDescripcion( )
    {
        return descripcion;
    }
    
    /**
     * Sets the id categoria.
     *
     * @param idCategoria the new id categoria
     */
    public void setIdCategoria( long idCategoria )
    {
        this.idCategoria = idCategoria;
    }
    
    /**
     * Sets the descripcion.
     *
     * @param descripcion the new descripcion
     */
    public void setDescripcion( String descripcion )
    {
        this.descripcion = descripcion;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
	public String toString() {
		return "CategoriaFuncional [idCategoria=" + idCategoria
				+ ", descripcion=" + descripcion + "]";
	}
}
