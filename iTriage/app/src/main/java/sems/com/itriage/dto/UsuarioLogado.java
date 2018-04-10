package sems.com.itriage.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;



// TODO: Auto-generated Javadoc
/**
 * Datos del usuario que son enviados de retorno
 * cuando se valida en el sistema.
 *
 * @author jabenitez
 */
public class UsuarioLogado implements Serializable
{
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The perfil ambito. */
    private PerfilAmbito perfilAmbito;
    
    /** The perfil acceso. */
    private Registro perfilAcceso;
    
    /** The token sesion. */
    private long tokenSesion;
    
    /** The ip puesto. */
    private String ipPuesto;
    
    /** The url servicio. */
    private String urlServicio;
    
    /** The locale. */
    private String locale;
    
    /** The ambito. */
    private String ambito;
    
    /** The apellidos. */
    private String apellidos;
    
    /** The id delegacion login. */
    private long idDelegacionLogin;
    
    /** The id delegacion pertenece. */
    private long idDelegacionPertenece;
    
    /** The delegacion pertenece. */
    private String delegacionPertenece;
    
    /** The identificador usuario. */
    private String identificadorUsuario;
    
    /** The nombre. */
    private String nombre;
    
    /** The coordinador. */
    private String coordinador;
    
    /** The funcionalidades. */
    private List<Funcionalidad> funcionalidades;
    
    /** The clave. */
    //private long clave;
    private String clave;
    
    /** The aplicaciones inicio. */
    private List<AplicacionInicio> aplicacionesInicio;
    
    /** The inicio sesion. */
    private Date fInicioSesion;
    
    /** The categorias funcionales. */
    private List<CategoriaFuncional> categoriasFuncionales;


    /**
     * Gets the perfil ambito.
     *
     * @return the perfil ambito
     */
    /* Metodos GET */
    public PerfilAmbito getPerfilAmbito()
    {
        return this.perfilAmbito;
    }
    
    /**
     * Gets the perfil acceso.
     *
     * @return the perfil acceso
     */
    public Registro getPerfilAcceso()
    {
        return this.perfilAcceso;
    }
    
    /**
     * Gets the token sesion.
     *
     * @return the token sesion
     */
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
     * Gets the ambito.
     *
     * @return the ambito
     */
    public String getAmbito()
    {
        return this.ambito;
    }

    /**
     * Gets the apellidos.
     *
     * @return the apellidos
     */
    public String getApellidos()
    {
        return this.apellidos;
    }
    
    /**
     * Gets the id delegacion login.
     *
     * @return the id delegacion login
     */
    public long getIdDelegacionLogin()
    {
        return this.idDelegacionLogin;
    }

    /**
     * Gets the id delegacion pertenece.
     *
     * @return the id delegacion pertenece
     */
    public long getIdDelegacionPertenece()
    {
        return this.idDelegacionPertenece;
    }

    /**
     * Gets the delegacion pertenece.
     *
     * @return the delegacion pertenece
     */
    public String getDelegacionPertenece()
    {
        return this.delegacionPertenece;
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
     * Gets the nombre.
     *
     * @return the nombre
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    /**
     * Gets the coordinador.
     *
     * @return the coordinador
     */
    public String getCoordinador()
    {
        return this.coordinador;
    }
    
    /**
     * Gets the funcionalidades.
     *
     * @return the funcionalidades
     */
    public List<Funcionalidad> getFuncionalidades()
    {
        return this.funcionalidades;
    }

    /**
     * Gets the clave.
     *
     * @return the clave
     */
    //public long getClave()
    public String getClave()
    {
        return this.clave;
    }
    
    /**
     * Gets the aplicaciones inicio.
     *
     * @return the aplicaciones inicio
     */
    public List<AplicacionInicio> getAplicacionesInicio()
    {
        return this.aplicacionesInicio;
    }
    
    /**
     * Gets the f inicio sesion.
     *
     * @return the f inicio sesion
     */
    public Date getfInicioSesion()
    {
        return this.fInicioSesion;
    }

    /**
     * Gets the categorias funcionales.
     *
     * @return the categorias funcionales
     */
    public List<CategoriaFuncional> getCategoriasFuncionales()
    {
        return this.categoriasFuncionales;
    }

    
    /**
     * Sets the perfil ambito.
     *
     * @param perfilAmbito the new perfil ambito
     */
    /* Metodos SET */
    public void setPerfilAmbito( PerfilAmbito perfilAmbito )
    {
        this.perfilAmbito = perfilAmbito;
    }
    
    /**
     * Sets the perfil acceso.
     *
     * @param perfilAcceso the new perfil acceso
     */
    public void setPerfilAcceso( Registro perfilAcceso )
    {
        this.perfilAcceso = perfilAcceso;
    }
    
    /**
     * Sets the token sesion.
     *
     * @param tokenSesion the new token sesion
     */
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
     * Sets the ambito.
     *
     * @param ambito the new ambito
     */
    public void setAmbito( String ambito )
    {
        this.ambito = ambito;
    }
    
    /**
     * Sets the apellidos.
     *
     * @param apellidos the new apellidos
     */
    public void setApellidos( String apellidos )
    {
        this.apellidos = apellidos;
    }
    
    /**
     * Sets the delegacion pertenece.
     *
     * @param delegacionPertenece the new delegacion pertenece
     */
    public void setDelegacionPertenece( String delegacionPertenece )
    {
        this.delegacionPertenece = delegacionPertenece;
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
     * Sets the nombre.
     *
     * @param nombre the new nombre
     */
    public void setNombre( String nombre )
    {
        this.nombre = nombre;
    }
    
    /**
     * Sets the coordinador.
     *
     * @param coordinador the new coordinador
     */
    public void setCoordinador( String coordinador )
    {
        this.coordinador = coordinador;
    }
    
    /**
     * Sets the funcionalidades.
     *
     * @param funcionalidades the new funcionalidades
     */
    public void setFuncionalidades(
            List<Funcionalidad> funcionalidades )
    {
        this.funcionalidades = funcionalidades;
    }
    
    /**
     * Sets the clave.
     *
     * @param clave the new clave
     */
    //public void setClave( long clave )
    public void setClave( String clave )
    {
        this.clave = clave;
    }
    
    /**
     * Sets the aplicaciones inicio.
     *
     * @param aplicacionesInicio the new aplicaciones inicio
     */
    public void setAplicacionesInicio( List<AplicacionInicio> aplicacionesInicio )
    {
        this.aplicacionesInicio = aplicacionesInicio;
    }

    /**
     * Sets the id delegacion pertenece.
     *
     * @param idDelegacionPertenece the new id delegacion pertenece
     */
    public void setIdDelegacionPertenece( long idDelegacionPertenece )
    {
        this.idDelegacionPertenece = idDelegacionPertenece;
    }

    /**
     * Sets the id delegacion login.
     *
     * @param idDelegacionLogin the new id delegacion login
     */
    public void setIdDelegacionLogin( long idDelegacionLogin )
    {
        this.idDelegacionLogin = idDelegacionLogin;
    }

    /**
     * Sets the f inicio sesion.
     *
     * @param fInicioSesion the new f inicio sesion
     */
    public void setfInicioSesion( Date fInicioSesion )
    {
        this.fInicioSesion = fInicioSesion;
    }

    /**
     * Sets the categorias funcionales.
     *
     * @param categoriasFuncionales the new categorias funcionales
     */
    public void setCategoriasFuncionales( List<CategoriaFuncional> categoriasFuncionales )
    {
        this.categoriasFuncionales = categoriasFuncionales;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UsuarioLogado [perfilAmbito=" + perfilAmbito + " perfilAmbito=" 
				+ perfilAmbito + ", tokenSesion="
				+ tokenSesion + ", ipPuesto=" + ipPuesto + ", urlServicio="
				+ urlServicio + ", locale=" + locale + ", ambito=" + ambito
				+ ", apellidos=" + apellidos + ", idDelegacionLogin="
				+ idDelegacionLogin + ", idDelegacionPertenece="
				+ idDelegacionPertenece + ", delegacionPertenece="
				+ delegacionPertenece + ", identificadorUsuario="
				+ identificadorUsuario + ", nombre=" + nombre
				+ ", coordinador=" + coordinador + ", funcionalidades="
				+ funcionalidades + ", clave=" + clave
				+ ", aplicacionesInicio=" + aplicacionesInicio
				+ ", fInicioSesion=" + fInicioSesion
				+ ", categoriasFuncionales=" + categoriasFuncionales + "]";
	}
    
   
}