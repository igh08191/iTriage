package sems.com.itriage.dto;


// TODO: Auto-generated Javadoc
/**
 * Clase que contiene los parametros de entrada del metodo 
 * <b>iniciarSesion</b> del servicio SACCE.
 *
 * @author jabenitez
 */
public class IniciarSesionDataIn
{
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /** The id perfil acceso. */
    private long   idPerfilAcceso;
    
    /** The url servicio. */
    private String urlServicio;
    
    /** The identificador usuario. */
    private String identificadorUsuario;
    
    /** The password. */
    private String password;
    
    /** The locale. */
    private String locale;
    
    /** The token sesion cerrar. */
    private long   tokenSesionCerrar;
    
    /** The id agencia. */
    private long   idAgencia;
    
    /** The id perfil funcional. */
    private long   idPerfilFuncional;
    
    /** The ip real puesto. */
    //EPES 245. 
    private String ipRealPuesto;
    
    /** The ip virtual puesto. */
    private String ipVirtualPuesto;
    
    /** The id delegacion. */
    //IGH-20110601
    private long idDelegacion;//Delegacion donde se loga el usuario
    
    /** The id perfil acd. */
    //fin IGH-20110601
    private long idPerfilACD;
        
	/**
	 * Instantiates a new iniciar sesion data in.
	 */
	public IniciarSesionDataIn()
	{
	}

	/**
	 * Instantiates a new iniciar sesion data in.
	 *
	 * @param dataIn the data in
	 */
//	public IniciarSesionDataIn(DataIn dataIn)
//	{
//		super(dataIn);
//	}

	/**
	 * Gets the id perfil acceso.
	 *
	 * @return the id perfil acceso
	 */
	/* Metodos GET */
    public long getIdPerfilAcceso()
    {
        return this.idPerfilAcceso;
    }
    
    /**
     * Gets the id delegacion.
     *
     * @return the id delegacion
     */
    //IGH-20110601
    public long getIdDelegacion()
    {
        return this.idDelegacion;
    }
    //IGH-20110601
    
    /**
     * Gets the url servicio.
     *
     * @return the url servicio
     */
    public String getUrlServicio()
    {
        return this.urlServicio;
    }
    
    /**
     * Gets the identificador usuario.
     *
     * @return the identificador usuario
     */
    public String getIdentificadorUsuario()
    {
        return this.identificadorUsuario;
    }
    
    /**
     * Gets the password.
     *
     * @return the password
     */
    public String getPassword()
    {
        return this.password;
    }
    
    /**
     * Gets the locale.
     *
     * @return the locale
     */
    public String getLocale()
    {
        return this.locale;
    }
    
    /**
     * Gets the token sesion cerrar.
     *
     * @return the token sesion cerrar
     */
    public long getTokenSesionCerrar()
    {
        return this.tokenSesionCerrar;
    }

    /**
     * Gets the id agencia.
     *
     * @return the id agencia
     */
    public long getIdAgencia()
    {
        return this.idAgencia;
    }
    
    /**
     * Gets the id perfil funcional.
     *
     * @return the id perfil funcional
     */
   public long getIdPerfilFuncional()
    {
        return this.idPerfilFuncional;
    }
    
    /**
     * Gets the ip real puesto.
     *
     * @return the ip real puesto
     */
    public String getIpRealPuesto()
    {
        return this.ipRealPuesto;
    }

    /**
     * Gets the ip virtual puesto.
     *
     * @return the ip virtual puesto
     */
    public String getIpVirtualPuesto()
    {
        return this.ipVirtualPuesto;
    }
    
    /**
     * Gets the id perfil acd.
     *
     * @return the id perfil acd
     */
    public long getIdPerfilACD() {
		return this.idPerfilACD;
	}
    
    
    
    /**
     * Sets the id perfil acceso.
     *
     * @param idPerfilAcceso the new id perfil acceso
     */
    /* Metodos SET */
    public void setIdPerfilAcceso( long idPerfilAcceso )
    {
        this.idPerfilAcceso = idPerfilAcceso;
    }
    
    /**
     * Sets the id delegacion.
     *
     * @param idDelegacion the new id delegacion
     */
    //IGH-20110601
    public void setIdDelegacion( long idDelegacion )
    {
        this.idDelegacion = idDelegacion;
    }
    //IGH-20110601
    
    /**
     * Sets the url servicio.
     *
     * @param urlServicio the new url servicio
     */
    public void setUrlServicio( String urlServicio )
    {
        this.urlServicio = urlServicio;
    }
    
    /**
     * Sets the identificador usuario.
     *
     * @param identificadorUsuario the new identificador usuario
     */
    public void setIdentificadorUsuario( String identificadorUsuario )
    {
        this.identificadorUsuario = identificadorUsuario;
    }
    
    /**
     * Sets the password.
     *
     * @param password the new password
     */
    public void setPassword( String password )
    {
        this.password = password;
    }
    
    /**
     * Sets the locale.
     *
     * @param locale the new locale
     */
    public void setLocale( String locale )
    {
        this.locale = locale;
    }

    /**
     * Sets the token sesion cerrar.
     *
     * @param tokenSesionCerrar the new token sesion cerrar
     */
    public void setTokenSesionCerrar( long tokenSesionCerrar )
    {
        this.tokenSesionCerrar = tokenSesionCerrar;
    }

    /**
     * Sets the id agencia.
     *
     * @param idAgencia the new id agencia
     */
    public void setIdAgencia( long idAgencia )
    {
        this.idAgencia = idAgencia;
    }

    /**
     * Sets the id perfil funcional.
     *
     * @param idPerfilFuncional the new id perfil funcional
     */
    public void setIdPerfilFuncional( long idPerfilFuncional )
    {
        this.idPerfilFuncional = idPerfilFuncional;
    }
    
    /**
     * Sets the ip real puesto.
     *
     * @param ipRealPuesto the new ip real puesto
     */
    public void setIpRealPuesto( String ipRealPuesto )
    {
        this.ipRealPuesto = ipRealPuesto;
    }
    
    /**
     * Sets the ip virtual puesto.
     *
     * @param ipVirtualPuesto the new ip virtual puesto
     */
    public void setIpVirtualPuesto( String ipVirtualPuesto )
    {
        this.ipVirtualPuesto = ipVirtualPuesto;
    }
    
    /**
     * Sets the id perfil acd.
     *
     * @param idPerfilACD the new id perfil acd
     */
    public void setIdPerfilACD(long idPerfilACD) {
		this.idPerfilACD = idPerfilACD;
	}
}
