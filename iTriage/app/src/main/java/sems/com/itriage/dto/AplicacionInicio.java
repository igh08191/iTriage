package sems.com.itriage.dto;

import java.io.Serializable;


// TODO: Auto-generated Javadoc
/**
 * Clase que mapea la ejecucion de una aplicacion al iniciar
 * la sesion.
 *
 * @author jabenitez
 */
public class AplicacionInicio implements Serializable
{
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /** The id aplicacion. */
    private long   idAplicacion;
    
    /** The nombre. */
    private String nombre;
    
    /** The exe. */
    private String exe;
    
    /** The path. */
    private String path;
    
    /** The ruta base servicio. */
    private String rutaBaseServicio;
    
    /** The ruta servicio. */
    private String rutaServicio;
    
    /** The id categoria. */
    private long   idCategoria;
	
	/** The modo arranque. */
	private long   modoArranque;
    
    /** The mostrar botonera. */
    private long   mostrarBotonera;
    
    /** The pos x. */
    private long   posX;
	
	/** The pos y. */
	private long   posY;
    
    /** The ancho. */
    private long   ancho;
	
	/** The alto. */
	private long   alto;
    
    /** The tool tip. */
    private String toolTip;
    
    /** The icono. */
    private byte[] icono;
    
    /** The orden. */
    private long orden;
    
    
    /**
     * Instantiates a new aplicacion inicio.
     */
    /* Constructores */
    public AplicacionInicio() {  }
    
    /**
     * Instantiates a new aplicacion inicio.
     *
     * @param idAplicacion the id aplicacion
     * @param path the path
     * @param exe the exe
     * @param rutaBaseServicio the ruta base servicio
     * @param rutaServicio the ruta servicio
     * @param idCategoria the id categoria
     */
    public AplicacionInicio( long idAplicacion, String path, String exe, 
            String rutaBaseServicio, String rutaServicio, long idCategoria ) 
    {
        this.idAplicacion = idAplicacion;
        this.path = path;
        this.exe = exe;
        this.rutaBaseServicio = rutaBaseServicio;
        this.rutaServicio = rutaServicio;
        this.idCategoria = idCategoria;
    }
    
    
    /**
     * Instantiates a new aplicacion inicio.
     *
     * @param idAplicacion the id aplicacion
     * @param path the path
     * @param exe the exe
     * @param rutaBaseServicio the ruta base servicio
     * @param rutaServicio the ruta servicio
     * @param idCategoria the id categoria
     * @param nombre the nombre
     */
    public AplicacionInicio( long idAplicacion, String path, String exe, 
            String rutaBaseServicio, String rutaServicio, long idCategoria,
            String nombre) 
    {
        this.idAplicacion = idAplicacion;
        this.path = path;
        this.exe = exe;
        this.rutaBaseServicio = rutaBaseServicio;
        this.rutaServicio = rutaServicio;
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }
    
    
    /**
     * Instantiates a new aplicacion inicio.
     *
     * @param idAplicacion the id aplicacion
     * @param nombre the nombre
     * @param exe the exe
     * @param path the path
     * @param rutaBaseServicio the ruta base servicio
     * @param rutaServicio the ruta servicio
     * @param idCategoria the id categoria
     * @param modoArranque the modo arranque
     * @param mostrarBotonera the mostrar botonera
     * @param posX the pos x
     * @param posY the pos y
     * @param ancho the ancho
     * @param alto the alto
     * @param toolTip the tool tip
     * @param icono the icono
     * @param orden the orden
     */
    public AplicacionInicio(long idAplicacion, String nombre, String exe,
			String path, String rutaBaseServicio, String rutaServicio,
			long idCategoria, long modoArranque, long mostrarBotonera,
			long posX, long posY, long ancho, long alto, String toolTip,
			byte[] icono, long orden) 
	{
		this.idAplicacion = idAplicacion;
		this.nombre = nombre;
		this.exe = exe;
		this.path = path;
		this.rutaBaseServicio = rutaBaseServicio;
		this.rutaServicio = rutaServicio;
		this.idCategoria = idCategoria;
		this.modoArranque = modoArranque;
		this.mostrarBotonera = mostrarBotonera;
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.alto = alto;
		this.toolTip = toolTip;
		this.icono = icono;
		this.orden = orden;
	}
    
    
    /**
     * Gets the nombre.
     *
     * @return the nombre
     */
    /* Metodos GET */
    public String getNombre()
    {
        return this.nombre;
    }
    
    /**
     * Gets the id aplicacion.
     *
     * @return the id aplicacion
     */
    public long getIdAplicacion()
    {
        return this.idAplicacion;
    }
    
    /**
     * Gets the exe.
     *
     * @return the exe
     */
    public String getExe()
    {
        return this.exe;
    }

    /**
     * Gets the path.
     *
     * @return the path
     */
    public String getPath()
    {
        return this.path;
    }

    /**
     * Gets the ruta base servicio.
     *
     * @return the ruta base servicio
     */
    public String getRutaBaseServicio()
    {
        return this.rutaBaseServicio;
    }

    /**
     * Gets the ruta servicio.
     *
     * @return the ruta servicio
     */
    public String getRutaServicio()
    {
        return this.rutaServicio;
    }
    
    /**
     * Gets the id categoria.
     *
     * @return the id categoria
     */
    public long getIdCategoria()
    {
        return this.idCategoria;
    }
    
    /**
     * Gets the modo arranque.
     *
     * @return the modo arranque
     */
    public long getModoArranque() {
		return this.modoArranque;
	}

	/**
	 * Gets the mostrar botonera.
	 *
	 * @return the mostrar botonera
	 */
	public long getMostrarBotonera() {
		return this.mostrarBotonera;
	}

	/**
	 * Gets the pos x.
	 *
	 * @return the pos x
	 */
	public long getPosX() {
		return this.posX;
	}

	/**
	 * Gets the pos y.
	 *
	 * @return the pos y
	 */
	public long getPosY() {
		return this.posY;
	}

	/**
	 * Gets the ancho.
	 *
	 * @return the ancho
	 */
	public long getAncho() {
		return this.ancho;
	}

	/**
	 * Gets the alto.
	 *
	 * @return the alto
	 */
	public long getAlto() {
		return this.alto;
	}

	/**
	 * Gets the tool tip.
	 *
	 * @return the tool tip
	 */
	public String getToolTip() {
		return this.toolTip;
	}

	/**
	 * Gets the icono.
	 *
	 * @return the icono
	 */
	public byte[] getIcono() {
		return this.icono;
	}
    
    /**
     * Gets the orden.
     *
     * @return the orden
     */
	public long getOrden() {
		return this.orden;
	}
    
    
    /**
     * Sets the nombre.
     *
     * @param nombre the nombre
     */
    /* Metodos SET */
    public void SetNombre( String nombre )
    {
    	this.nombre = nombre;
    }
    
    /**
     * Sets the id aplicacion.
     *
     * @param idAplicacion the new id aplicacion
     */
    public void setIdAplicacion( long idAplicacion )
    {
        this.idAplicacion = idAplicacion;
    }
    
    /**
     * Sets the exe.
     *
     * @param exe the new exe
     */
    public void setExe( String exe )
    {
        this.exe = exe;
    }

    /**
     * Sets the path.
     *
     * @param path the new path
     */
    public void setPath( String path )
    {
        this.path = path;
    }

    /**
     * Sets the ruta base servicio.
     *
     * @param rutaBaseServicio the new ruta base servicio
     */
    public void setRutaBaseServicio( String rutaBaseServicio )
    {
        this.rutaBaseServicio = rutaBaseServicio;
    }

    /**
     * Sets the ruta servicio.
     *
     * @param rutaServicio the new ruta servicio
     */
    public void setRutaServicio( String rutaServicio )
    {
        this.rutaServicio = rutaServicio;
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
     * Sets the nombre.
     *
     * @param nombre the new nombre
     */
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Sets the modo arranque.
	 *
	 * @param modoArranque the new modo arranque
	 */
	public void setModoArranque(long modoArranque) {
		this.modoArranque = modoArranque;
	}

	/**
	 * Sets the mostrar botonera.
	 *
	 * @param mostrarBotonera the new mostrar botonera
	 */
	public void setMostrarBotonera(long mostrarBotonera) {
		this.mostrarBotonera = mostrarBotonera;
	}

	/**
	 * Sets the pos x.
	 *
	 * @param posX the new pos x
	 */
	public void setPosX(long posX) {
		this.posX = posX;
	}

	/**
	 * Sets the pos y.
	 *
	 * @param posY the new pos y
	 */
	public void setPosY(long posY) {
		this.posY = posY;
	}

	/**
	 * Sets the ancho.
	 *
	 * @param ancho the new ancho
	 */
	public void setAncho(long ancho) {
		this.ancho = ancho;
	}

	/**
	 * Sets the alto.
	 *
	 * @param alto the new alto
	 */
	public void setAlto(long alto) {
		this.alto = alto;
	}

	/**
	 * Sets the tool tip.
	 *
	 * @param toolTip the new tool tip
	 */
	public void setToolTip(String toolTip) {
		this.toolTip = toolTip;
	}

	/**
	 * Sets the icono.
	 *
	 * @param icono the new icono
	 */
	public void setIcono(byte[] icono) {
		this.icono = icono;
	}

	/**
	 * Sets the orden.
	 *
	 * @param orden the new orden
	 */
	public void setOrden(long orden) {
		this.orden = orden;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AplicacionInicio [idAplicacion=" + idAplicacion + ", nombre="
				+ nombre + ", exe=" + exe + ", path=" + path
				+ ", rutaBaseServicio=" + rutaBaseServicio + ", rutaServicio="
				+ rutaServicio + ", idCategoria=" + idCategoria
				+ ", modoArranque=" + modoArranque + ", mostrarBotonera="
				+ mostrarBotonera + ", posX=" + posX + ", posY=" + posY
				+ ", ancho=" + ancho + ", alto=" + alto + ", toolTip="
				+ toolTip + /*", icono=" + Arrays.toString(icono) +*/ ", orden="
				+ orden + "]";
	}

	}
