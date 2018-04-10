package sems.com.itriage.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class Sesion.
 *
 * @author jabenitez
 */
public class Sesion implements Serializable
{
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id sesion. */
    private long idSesion;
    
    /** The id usuario. */
    private long idUsuario;
    
    /** The inicio. */
    private Date fInicio;
    
    /** The url servicio. */
    private String urlServicio;
    
    /** The locale. */
    private String locale;
    
    /** The codigo. */
    private String codigo;
    
    /** The ventana. */
    private String ventana;
    
    /** The delegs visibles. */
    private String delegsVisibles;
    
    /** The id agencia. */
    private long idAgencia;
    
    /** The id perfil funcional. */
    private long idPerfilFuncional;
    
    /** The ids entidades disponibles. */
    private String idsEntidadesDisponibles;
  
  /** The ip real puesto. */
  //EPES 245. 
    private String ipRealPuesto;
	
	/** The ip virtual puesto. */
	private String ipVirtualPuesto;
    //1.1.3.4 - Al obtener la sesi�n a partir del id de usuario, necesito saber
    /** The id delegacion. */
    //en que delegaci�n se ha logado
    private long idDelegacion;

    /** The id perfil acd. */
    private long 	idPerfilACD;

    /** The perfil acd. */
    private String  perfilACD;

    /** The fecha ping. */
    private Date fechaPing;

	/**
	 * Instantiates a new sesion.
	 */
	/* Constructores */
    public Sesion() { }
    
    /**
     * Instantiates a new sesion.
     *
     * @param idSesion the id sesion
     * @param idUsuario the id usuario
     * @param fInicio the f inicio
     * @param urlServicio the url servicio
     * @param locale the locale
     * @param codigo the codigo
     * @param ventana the ventana
     * @param delegsVisibles the delegs visibles
     * @param idAgencia the id agencia
     * @param idPerfilFuncional the id perfil funcional
     * @param idsEntidadesDisponibles the ids entidades disponibles
     * @param ipRealPuesto the ip real puesto
     * @param ipVirtualPuesto the ip virtual puesto
     */
    public Sesion( long idSesion, long idUsuario, Date fInicio, 
            String urlServicio, String locale, String codigo, 
            String ventana, String delegsVisibles, long idAgencia,
            long idPerfilFuncional, String idsEntidadesDisponibles,
            String ipRealPuesto, String ipVirtualPuesto ) 
    {
        this.idSesion = idSesion;
        this.idUsuario = idUsuario;
        this.fInicio = fInicio;
        this.urlServicio = urlServicio;
        this.locale = locale;
        this.codigo = codigo;
        this.ventana = ventana;
        this.delegsVisibles = delegsVisibles;
        this.idAgencia = idAgencia;
        this.idPerfilFuncional = idPerfilFuncional;
        this.idsEntidadesDisponibles = idsEntidadesDisponibles;
        this.ipRealPuesto = ipRealPuesto;
        this.ipVirtualPuesto = ipVirtualPuesto;
    }
    
    /**
     * Instantiates a new sesion.
     *
     * @param idSesion the id sesion
     * @param idUsuario the id usuario
     * @param fInicio the f inicio
     * @param urlServicio the url servicio
     * @param locale the locale
     * @param codigo the codigo
     * @param ventana the ventana
     * @param delegsVisibles the delegs visibles
     * @param idAgencia the id agencia
     * @param idPerfilFuncional the id perfil funcional
     * @param idsEntidadesDisponibles the ids entidades disponibles
     * @param ipRealPuesto the ip real puesto
     * @param ipVirtualPuesto the ip virtual puesto
     * @param idDelegacion the id delegacion
     */
    public Sesion(long idSesion, long idUsuario, Date fInicio,
			String urlServicio, String locale, String codigo, String ventana,
			String delegsVisibles, long idAgencia, long idPerfilFuncional,
			String idsEntidadesDisponibles, String ipRealPuesto,
			String ipVirtualPuesto, long idDelegacion) {
		this.idSesion = idSesion;
		this.idUsuario = idUsuario;
		this.fInicio = fInicio;
		this.urlServicio = urlServicio;
		this.locale = locale;
		this.codigo = codigo;
		this.ventana = ventana;
		this.delegsVisibles = delegsVisibles;
		this.idAgencia = idAgencia;
		this.idPerfilFuncional = idPerfilFuncional;
		this.idsEntidadesDisponibles = idsEntidadesDisponibles;
		this.ipRealPuesto = ipRealPuesto;
		this.ipVirtualPuesto = ipVirtualPuesto;
		this.idDelegacion = idDelegacion;
	}
    
    
    /**
     * Gets the id sesion.
     *
     * @return the id sesion
     */
    /* Metodos GET */
    public long getIdSesion()
    {
        return this.idSesion;
    }
    
    /**
     * Gets the id usuario.
     *
     * @return the id usuario
     */
    public long getIdUsuario()
    {
        return this.idUsuario;
    }
    
    /**
     * Gets the f inicio.
     *
     * @return the f inicio
     */
    public Date getfInicio()
    {
        return this.fInicio;
    }
    
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
     * Gets the locale.
     *
     * @return the locale
     */
    public String getLocale()
    {
        return this.locale;
    }
    
    /**
     * Gets the codigo.
     *
     * @return the codigo
     */
    public String getCodigo()
    {
        return this.codigo;
    }
    
    /**
     * Gets the ventana.
     *
     * @return the ventana
     */
    public String getVentana()
    {
        return this.ventana;
    }
    
    /**
     * Gets the delegs visibles.
     *
     * @return the delegs visibles
     */
    public String getDelegsVisibles()
    {
        return this.delegsVisibles;
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
     * Gets the ids entidades disponibles.
     *
     * @return the ids entidades disponibles
     */
    public String getIdsEntidadesDisponibles()
    {
        return this.idsEntidadesDisponibles;
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
     * Gets the id delegacion.
     *
     * @return the id delegacion
     */
    public long getIdDelegacion() {
		return this.idDelegacion;
	}

    /**
     * Gets the id perfil acd.
     *
     * @return the id perfil acd
     */
    /* Metodos GET */
    public long getIdPerfilACD() {
        return this.idPerfilACD;
    }

    /**
     * Gets the perfil acd.
     *
     * @return the perfil acd
     */
    public String getPerfilACD() {
        return this.perfilACD;
    }

    /**
     * Gets the fecha ping.
     *
     * @return the fecha ping
     */
    public Date getFechaPing() {
        return this.fechaPing;
    }
    /**
     * Sets the id sesion.
     *
     * @param idSesion the new id sesion
     */
    /* Metodos SET */
    public void setIdSesion( long idSesion )
    {
        this.idSesion = idSesion;
    }
    
    /**
     * Sets the id usuario.
     *
     * @param idUsuario the new id usuario
     */
    public void setIdUsuario( long idUsuario )
    {
        this.idUsuario = idUsuario;
    }
    
    /**
     * Sets the f inicio.
     *
     * @param fInicio the new f inicio
     */
    public void setfInicio( Date fInicio )
    {
        this.fInicio = fInicio;
    }
    
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
     * Sets the locale.
     *
     * @param locale the new locale
     */
    public void setLocale( String locale )
    {
        this.locale = locale;
    }
    
    /**
     * Sets the codigo.
     *
     * @param codigo the new codigo
     */
    public void setCodigo( String codigo )
    {
        this.codigo = codigo;
    }
    
    /**
     * Sets the ventana.
     *
     * @param ventana the new ventana
     */
    public void setVentana( String ventana )
    {
        this.ventana = ventana;
    }

    /**
     * Sets the delegs visibles.
     *
     * @param delegsVisibles the new delegs visibles
     */
    public void setDelegsVisibles( String delegsVisibles )
    {
        this.delegsVisibles = delegsVisibles;
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
     * Sets the ids entidades disponibles.
     *
     * @param idsEntidadesDisponibles the new ids entidades disponibles
     */
    public void setIdsEntidadesDisponibles( String idsEntidadesDisponibles )
    {
        this.idsEntidadesDisponibles = idsEntidadesDisponibles;
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
     * Sets the id delegacion.
     *
     * @param idDelegacion the new id delegacion
     */
    public void setIdDelegacion(long idDelegacion) {
		this.idDelegacion = idDelegacion;
	}

    /**
     * Sets the id perfil acd.
     *
     * @param idPerfilACD the new id perfil acd
     */
    /* Metodos SET */
    public void setIdPerfilACD(long idPerfilACD) {
        this.idPerfilACD = idPerfilACD;
    }

    /**
     * Sets the perfil acd.
     *
     * @param perfilACD the new perfil acd
     */
    public void setPerfilACD(String perfilACD) {
        this.perfilACD = perfilACD;
    }

    /**
     * Sets the fecha ping.
     *
     * @param fechaPing the new fecha ping
     */
    public void setFechaPing(Date fechaPing) {
        this.fechaPing = fechaPing;
    }	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Sesion [idSesion=" + idSesion + ", idPerfil=" + idUsuario
				+ ", fInicio=" + fInicio + ", urlServicio=" + urlServicio
				+ ", locale=" + locale + ", codigo=" + codigo + ", ventana="
				+ ventana + ", delegsVisibles=" + delegsVisibles
				+ ", idAgencia=" + idAgencia + ", idPerfilFuncional="
				+ idPerfilFuncional + ", idsEntidadesDisponibles="
				+ idsEntidadesDisponibles + ", ipRealPuesto=" + ipRealPuesto
				+ ", ipVirtualPuesto=" + ipVirtualPuesto + ", idDelegacion="
				+ idDelegacion + "]";
	}
    
    
}
