package sems.com.itriage.dto;

import java.io.Serializable;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * Clase que mapea un perfil de un usuario en un ambito .
 *
 * @author jabenitez
 */
public class PerfilAmbito implements Serializable
{
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /** The id perfil. */
    private long 				idPerfil;
    
    /** The id ambito. */
    private long 				idAmbito;
    
    /** The ambito. */
    private String 				ambito;
    
    /** The id perfil funcional. */
    private long 				idPerfilFuncional;
    
    /** The perfil funcional. */
    private String 				perfilFuncional;
    
    /** The sesiones abiertas. */
    private List<SesionAbierta> sesionesAbiertas;
    
    /** The id perfil acd. */
    private long     			idPerfilACD;    
	
	/** The perfil acd. */
	private String   			perfilACD;
    
    
    /**
     * Instantiates a new perfil ambito.
     */
    /* Constructores */
    public PerfilAmbito() { }
    
    
    /**
     * Instantiates a new perfil ambito.
     *
     * @param idPerfil the id perfil
     * @param idPerfilFuncional the id perfil funcional
     * @param perfilFuncional the perfil funcional
     * @param idAmbito the id ambito
     * @param ambito the ambito
     * @param sesionesAbiertas the sesiones abiertas
     */
    public PerfilAmbito( long idPerfil, long idPerfilFuncional, String perfilFuncional, 
            long idAmbito, String ambito, List<SesionAbierta> sesionesAbiertas )
    {
        this.idPerfil = idPerfil;
        this.idAmbito = idAmbito;
        this.ambito = ambito;
        this.idPerfilFuncional = idPerfilFuncional;
        this.perfilFuncional = perfilFuncional;
        this.sesionesAbiertas = sesionesAbiertas;
    }
    
    
    /**
     * Instantiates a new perfil ambito.
     *
     * @param idPerfil the id perfil
     * @param idPerfilFuncional the id perfil funcional
     * @param perfilFuncional the perfil funcional
     * @param idAmbito the id ambito
     * @param ambito the ambito
     * @param sesionesAbiertas the sesiones abiertas
     * @param idPerfilACD the id perfil acd
     * @param perfilACD the perfil acd
     */
    public PerfilAmbito( long idPerfil, long idPerfilFuncional, 
    		String perfilFuncional, long idAmbito, String ambito, 
    		List<SesionAbierta> sesionesAbiertas, long idPerfilACD, 
    		String perfilACD )
    {
        this.idPerfil 			= idPerfil;
        this.idAmbito 			= idAmbito;
        this.ambito 			= ambito;
        this.idPerfilFuncional 	= idPerfilFuncional;
        this.perfilFuncional 	= perfilFuncional;
        this.sesionesAbiertas 	= sesionesAbiertas;
        this.idPerfilACD 		= idPerfilACD;
        this.perfilACD 			= perfilACD;
    }
    
    
    
    /**
     * Gets the id perfil.
     *
     * @return the id perfil
     */
    /* Metodos GET */
    public long getIdPerfil()
    {
        return this.idPerfil;
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
     * Gets the perfil funcional.
     *
     * @return the perfil funcional
     */
    public String getPerfilFuncional()
    {
        return this.perfilFuncional;
    }
    
    /**
     * Gets the id ambito.
     *
     * @return the id ambito
     */
    public long getIdAmbito()
    {
        return this.idAmbito;
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
     * Gets the sesiones abiertas.
     *
     * @return the sesiones abiertas
     */
    public List<SesionAbierta> getSesionesAbiertas()
    {
        return this.sesionesAbiertas;
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
     * Gets the perfil acd.
     *
     * @return the perfil acd
     */
	public String getPerfilACD() {
		return this.perfilACD;
	}

    
    
    /**
     * Sets the id perfil.
     *
     * @param idPerfil the new id perfil
     */
    /* Metodos SET */
    public void setIdPerfil( long idPerfil )
    {
        this.idPerfil = idPerfil;
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
     * Sets the perfil funcional.
     *
     * @param perfilFuncional the new perfil funcional
     */
    public void setPerfilFuncional( String perfilFuncional )
    {
        this.perfilFuncional = perfilFuncional;
    }
    
    /**
     * Sets the id ambito.
     *
     * @param idAmbito the new id ambito
     */
    public void setIdAmbito( long idAmbito )
    {
        this.idAmbito = idAmbito;
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
     * Sets the sesiones abiertas.
     *
     * @param sesionesAbiertas the new sesiones abiertas
     */
    public void setSesionesAbiertas( List<SesionAbierta> sesionesAbiertas )
    {
        this.sesionesAbiertas = sesionesAbiertas;
    }
    
    /**
     * Sets the id perfil acd.
     *
     * @param idPerfilACD the new id perfil acd
     */
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
//		private long 				idPerfil;
//	    private long 				idAmbito;
//	    private String 				ambito;
//	    private long 				idPerfilFuncional;
//	    private String 				perfilFuncional;
//	    private List<SesionAbierta> sesionesAbiertas;
//	    private long     			idPerfilACD;    
//		private String   			perfilACD;
		StringBuilder sbr = new StringBuilder();
		
		sbr.append(" idPerfil: ").append(idPerfil).
			append(" | idAmbito: ").append(idAmbito).
			append(" | ambito: ").append(ambito).
			append(" | idPerfilFuncional: ").append(idPerfilFuncional).
			append(" | perfilFuncional: ").append(perfilFuncional).
			append(" | idPerfilACD: ").append(idPerfilACD).
			append(" | perfilACD: ").append(perfilACD).
			append(" | SES. ABIERTAS: [");
		
		if( this.sesionesAbiertas != null && 
				!this.sesionesAbiertas.isEmpty())
		{
			for( SesionAbierta ses : this.sesionesAbiertas )
			{
				sbr.append("{SESION: ").append(ses.toString()).append("}");
			}
		}
		sbr.append("]");
		
		return sbr.toString();
	}
}